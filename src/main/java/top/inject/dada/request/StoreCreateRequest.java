package top.inject.dada.request;

import top.inject.dada.model.in.DaDaStore;
import top.inject.dada.protocol.Request;

import java.util.ArrayList;

@Request(url = "/api/shop/add")
public class StoreCreateRequest extends ArrayList<DaDaStore> {

}
