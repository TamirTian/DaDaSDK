package top.inject.dada.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.beanutils.BeanUtils;
import top.inject.dada.config.Config;
import top.inject.dada.model.in.DaDaCancelOrder;
import top.inject.dada.model.in.DaDaTransportOrder;
import top.inject.dada.model.out.DaDaCancelResult;
import top.inject.dada.model.out.DaDaCanceledReason;
import top.inject.dada.model.out.DaDaOrder;
import top.inject.dada.model.out.DaDaTransport;
import top.inject.dada.protocol.ResponseContainer;
import top.inject.dada.request.*;
import top.inject.dada.response.DaDaResponse;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class OrderService extends DaDaService {
    private final Config config;

    public OrderService(Config config) {
        this.config = config;
    }

    /**
     * 查询订单
     * 查询订单的相关信息以及骑手的相关信息，具体信息参见参数说明。
     *
     * @param sourceId 商户
     * @param orderId  第三方订单号
     * @return response
     */
    public DaDaResponse<DaDaOrder> get(Long sourceId, String orderId) {
        OrderQueryRequest request = new OrderQueryRequest();
        request.setOrderId(orderId);

        ResponseContainer container = call(config, sourceId, request);

        DaDaResponse<DaDaOrder> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            DaDaOrder order = JSONObject.parseObject(container.getResult(), DaDaOrder.class);
            response.setResult(order);
        }

        return response;
    }

    /**
     * 创建订单
     * 新增配送单接口
     *
     * @param sourceId 商户
     * @param order    订单
     * @return response
     */
    public DaDaResponse<DaDaTransport> create(Long sourceId, DaDaTransportOrder order) {
        OrderCreateRequest request = new OrderCreateRequest();
        try {
            BeanUtils.copyProperties(request, order);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        request.setOriginId(order.getOrderId());

        ResponseContainer container = call(config, sourceId, request);

        DaDaResponse<DaDaTransport> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            response.setResult(JSONObject.parseObject(container.getResult(), DaDaTransport.class));
        }

        return response;
    }

    /**
     * 重新发布订单
     * 在调用新增订单后，订单被取消、过期或者投递异常的情况下，调用此接口，可以在达达平台重新发布订单。
     *
     * @param sourceId 商户
     * @param order    订单
     * @return response
     */
    public DaDaResponse<DaDaTransport> recreate(Long sourceId, DaDaTransportOrder order) {
        OrderRecreateRequest request = new OrderRecreateRequest();
        try {
            BeanUtils.copyProperties(request, order);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        request.setOriginId(order.getOrderId());

        ResponseContainer container = call(config, sourceId, request);

        DaDaResponse<DaDaTransport> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            response.setResult(JSONObject.parseObject(container.getResult(), DaDaTransport.class));
        }

        return response;
    }

    /**
     * 取消订单
     * 在订单待接单或待取货情况下，调用此接口可取消订单。注意：接单后1－15分钟内取消订单，运费退回。同时扣除2元作为给配送员的违约金
     *
     * @param sourceId 商户
     * @return response
     */
    public DaDaResponse<DaDaCancelResult> cancel(Long sourceId, DaDaCancelOrder order) {
        OrderCancelRequest request = new OrderCancelRequest();
        try {
            BeanUtils.copyProperties(request, order);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        ResponseContainer container = call(config, sourceId, request);

        DaDaResponse<DaDaCancelResult> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            response.setResult(JSONObject.parseObject(container.getResult(), DaDaCancelResult.class));
        }

        return response;
    }

    /**
     * 查询订单取消原因列表
     * 调用取消订单接口时，需要传递取消原因ID，通过此接口获取订单取消理由列表
     *
     * @param sourceId 商户
     * @return response
     */
    public DaDaResponse<List<DaDaCanceledReason>> getCanceledReasons(Long sourceId) {
        OrderCanceledReasonRequest request = new OrderCanceledReasonRequest();

        ResponseContainer container = call(config, sourceId, request);

        DaDaResponse<List<DaDaCanceledReason>> response = new DaDaResponse<>(container);

        if (response.isSuccessful()) {
            List<DaDaCanceledReason> reasons = JSONObject.parseObject(container.getResult(), new TypeReference<List<DaDaCanceledReason>>() {
            });
            response.setResult(reasons);
        }

        return response;
    }
}