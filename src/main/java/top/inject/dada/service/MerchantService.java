package top.inject.dada.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import top.inject.dada.config.Config;
import top.inject.dada.model.out.DaDaCity;
import top.inject.dada.model.in.DaDaMerchant;
import top.inject.dada.protocol.ResponseContainer;
import top.inject.dada.request.CityQueryRequest;
import top.inject.dada.request.MerchantCreateRequest;
import top.inject.dada.response.DaDaResponse;

import java.util.List;

public class MerchantService extends DaDaService {
    private final Config config;

    public MerchantService(Config config) {
        this.config = config;
    }

    /**
     * 创建商户
     * 商户注册接口,并完成与该商户的绑定.生成的初始化密码会以短信形式发送给注册手机号
     *
     * @param merchant 商户信息
     * @return 商户id
     */
    public DaDaResponse<Long> create(DaDaMerchant merchant) {
        MerchantCreateRequest request = new MerchantCreateRequest();

        request.setMobile(merchant.getMobile());
        request.setCityName(merchant.getCityName());
        request.setEnterpriseName(merchant.getEnterpriseName());
        request.setEnterpriseAddress(merchant.getEnterpriseAddress());
        request.setContactName(merchant.getContactName());
        request.setContactPhone(merchant.getContactPhone());
        request.setEmail(merchant.getEmail());

        ResponseContainer container = call(config, "", request);

        DaDaResponse<Long> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            response.setResult(Long.parseLong(container.getResult()));
        }

        return response;
    }


    /**
     * 通过接口，获取城市信息列表。
     *
     * @param sourceId 商户
     * @return
     */
    public DaDaResponse<List<DaDaCity>> getCities(String sourceId) {
        CityQueryRequest request = new CityQueryRequest();

        ResponseContainer container = call(config, sourceId, request);

        DaDaResponse<List<DaDaCity>> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            List<DaDaCity> cities = JSONObject.parseObject(container.getResult(), new TypeReference<List<DaDaCity>>() {
            });
            response.setResult(cities);
        }

        return response;
    }
}
