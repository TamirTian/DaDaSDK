package top.inject.dada.utils;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.inject.dada.protocol.ResponseContainer;
import top.inject.dada.protocol.RequestContainer;

import java.io.IOException;


public class DataClient {
    private static final Logger LOG = LoggerFactory.getLogger(DataClient.class);
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    private static final OkHttpClient mOkHttpClient;

    static {
        mOkHttpClient = new OkHttpClient();
    }

    public static ResponseContainer execute(boolean sandbox, String url, RequestContainer daDaRequest) {
        String domain = getDomain(sandbox);
        String requestUrl = domain.concat(url);

        String requestParams = JSONObject.toJSONString(daDaRequest);
        if (sandbox) {
            LOG.info("url: {}, params: {}", requestUrl, requestParams);
        }

        RequestBody body = RequestBody.create(MEDIA_TYPE, requestParams);
        Request request = new Request.Builder()
                .addHeader("TAG", "MTSW")
                .url(requestUrl)
                .post(body)
                .build();

        try (Response response = mOkHttpClient.newCall(request).execute()) {
            String result = response.body().string();
            if (sandbox) {
                LOG.info("url: {}, result: {}", requestUrl, result);
            }
            return JSONObject.parseObject(result, ResponseContainer.class);
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    private static String getDomain(boolean sandbox) {
        return sandbox ? "http://newopen.qa.imdada.cn" : "http://newopen.imdada.cn";
    }
}
