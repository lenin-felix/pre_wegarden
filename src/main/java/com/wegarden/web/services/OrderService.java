package com.wegarden.web.services;

import com.wegarden.web.model.order.Order;
import com.wegarden.web.model.order.OrderDetail;
import com.wegarden.web.model.order.UserOrder;
import com.wegarden.web.model.stock.Stock;
import com.wegarden.web.model.stock.StockReport;
import com.wegarden.web.model.stock.StockReportOut;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList(String srchWd);
    List<UserOrder> getUserOrderList(String userUuid);
    List<OrderDetail> getOrderDetailList(String orderUuid);
    String payOrderItem(String orderUuid);
    List<StockReportOut> getReportStockOutList(String sDate, String eDate);
}
