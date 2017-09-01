package top.inject.dada.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import top.inject.dada.ConfigProvider;
import top.inject.dada.model.in.DaDaCancelOrder;
import top.inject.dada.model.in.DaDaTransportOrder;
import top.inject.dada.model.out.DaDaCancelResult;
import top.inject.dada.model.out.DaDaCanceledReason;
import top.inject.dada.model.out.DaDaOrder;
import top.inject.dada.model.out.DaDaTransport;
import top.inject.dada.response.DaDaResponse;

import java.util.List;
import java.util.UUID;

public class OrderServiceTest {
    private OrderService orderService;
    private MockService mockService;
    private String sourceId = ConfigProvider.getSourceId();

    @Before
    public void init() {
        orderService = new OrderService(ConfigProvider.get());
        mockService = new MockService(ConfigProvider.get());
    }

    @Test
    public void testCreate() {
        String orderId = UUID.randomUUID().toString();
        DaDaResponse<DaDaTransport> response = orderService.create(sourceId, buildOrderParam(orderId));

        Assert.assertTrue(response.isSuccessful());
        Assert.assertNotNull(response.getResult());
    }

    @Test
    public void testRecreate() throws InterruptedException {
        String orderId = UUID.randomUUID().toString();
        DaDaResponse<DaDaTransport> response = orderService.create(sourceId, buildOrderParam(orderId));

        Assert.assertTrue(response.isSuccessful());
        Assert.assertNotNull(response.getResult());

        Thread.sleep(3000L);
        mockService.cancel(sourceId, orderId, "测试");

        DaDaResponse<DaDaTransport> recreate = orderService.recreate(sourceId, buildOrderParam(orderId));

        Assert.assertTrue(recreate.isSuccessful());
        Assert.assertNotNull(recreate.getResult());
    }

    @Test
    public void testGet() {
        String orderId = UUID.randomUUID().toString();
        DaDaResponse<DaDaTransport> response = orderService.create(sourceId, buildOrderParam(orderId));

        Assert.assertTrue(response.isSuccessful());
        Assert.assertNotNull(response.getResult());

        DaDaResponse<DaDaOrder> orderResponse = orderService.get(sourceId, orderId);

        Assert.assertTrue(orderResponse.isSuccessful() || orderResponse.getCode().equals(2012));
    }

    @Test
    public void testGetCanceledReasons() {
        DaDaResponse<List<DaDaCanceledReason>> response = orderService.getCanceledReasons(sourceId);

        Assert.assertTrue(response.isSuccessful());
        Assert.assertFalse(response.getResult().isEmpty());
    }

    @Test
    public void testCancelOrder() throws InterruptedException {
        String orderId = UUID.randomUUID().toString();
        orderService.create(sourceId, buildOrderParam(orderId));

        Thread.sleep(3000L);
        DaDaCancelOrder order = new DaDaCancelOrder();
        order.setOrderId(orderId);
        order.setCancelReason("顾客取消订单");
        order.setCancelReasonId(4);

        DaDaResponse<DaDaCancelResult> result = orderService.cancel(sourceId, order);

        Assert.assertTrue(result.isSuccessful());
        Assert.assertNotNull(result.getResult());
    }

    private DaDaTransportOrder buildOrderParam(String orderId) {
        DaDaTransportOrder order = new DaDaTransportOrder();
        order.setShopNo(ConfigProvider.getShopNo());
        order.setOrderId(orderId);
        order.setCityId("010");
        order.setCargoPrice(111.11);
        order.setIsPrepay(0);
        order.setExpectedFetchTime(System.currentTimeMillis() / 1000);
        order.setReceiverName("田");
        order.setReceiverAddress("收货人地址");
        order.setReceiverLat(38.6518);
        order.setReceiverLng(104.07642);
        order.setReceiverPhone("17080055699");
        order.setCallback(ConfigProvider.getCallback());
        return order;
    }
}
