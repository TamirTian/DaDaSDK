package top.inject.dada.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import top.inject.dada.ConfigProvider;
import top.inject.dada.model.out.DaDaCity;
import top.inject.dada.model.in.DaDaMerchant;
import top.inject.dada.response.DaDaResponse;

import java.util.List;

public class MerchantServiceTest {
    private MerchantService merchantService;

    @Before
    public void init() {
        merchantService = new MerchantService(ConfigProvider.get());
    }

    @Test
    public void testGetCities() {
        DaDaResponse<List<DaDaCity>> response = merchantService.getCities(ConfigProvider.getSourceId());
        Assert.assertTrue(response.isSuccessful());
        Assert.assertTrue(response.getResult().size() > 0);
    }

    @Test
    public void testCreate() {
        DaDaMerchant merchant = new DaDaMerchant()
                .setMobile("17080055699")
                .setCityName("北京")
                .setEnterpriseName("测试科技有限公司")
                .setEnterpriseAddress("北京市海淀区西小口东升科技园B2")
                .setContactName("田阔")
                .setContactPhone("17080055699")
                .setEmail("tamir@inject.top");

        DaDaResponse<Long> response = merchantService.create(merchant);
        if (response.isSuccessful()) {
            Assert.assertNotNull(response.getResult());
        } else {
            Assert.assertEquals(response.getMsg(), "用户已存在");
        }
    }
}
