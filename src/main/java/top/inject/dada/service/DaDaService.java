package top.inject.dada.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import top.inject.dada.config.Config;
import top.inject.dada.protocol.Request;
import top.inject.dada.protocol.RequestContainer;
import top.inject.dada.protocol.ResponseContainer;
import top.inject.dada.utils.DataClient;
import top.inject.dada.utils.Signature;

import java.util.HashMap;

public class DaDaService {

    ResponseContainer call(Config config, String sourceId, Object biz) {
        Request annotation = biz.getClass().getAnnotation(Request.class);
        if (annotation == null) {
            throw new RuntimeException("Not found request annotation");
        }

        String bizJson = JSONObject.toJSONString(biz);

        RequestContainer request = new RequestContainer();
        request.setSourceId(sourceId);
        request.setBody("{}".equals(bizJson) ? "" : bizJson);
        request.setAppKey(config.getAppKey());
        request.setFormat(config.getFormat());
        request.setV(config.getVersion());
        request.setTimestamp(String.valueOf(System.currentTimeMillis() / 1000));
        request.setSignature(Signature.sign(config.getAppSecret(), JSON.parseObject(JSONObject.toJSONString(request), new TypeReference<HashMap<String, String>>() {
        })));

        return DataClient.execute(config.isSandbox(), annotation.url(), request);
    }
}
