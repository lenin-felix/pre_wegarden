package com.wegarden.web.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserOrder {

    @Id
    @JsonProperty("order_type")
    private String orderType;

    @JsonProperty("order_date")
    private String orderDate;

    @JsonProperty("order_return_date")
    private String orderReturnDate;

    @JsonProperty("order_subtotal")
    private String orderSubtotal;

    @JsonProperty("order_total")
    private String orderTotal;

    @JsonProperty("order_remark")
    private String orderRemark;

    @JsonProperty("order_uuid")
    private String orderUuid;

    public UserOrder(){

    }

    public UserOrder(String orderType, String orderDate, String orderReturnDate, String orderSubtotal, String orderTotal, String orderRemark, String orderUuid) {
        this.orderType = orderType;
        this.orderDate = orderDate;
        this.orderReturnDate = orderReturnDate;
        this.orderSubtotal = orderSubtotal;
        this.orderTotal = orderTotal;
        this.orderRemark = orderRemark;
        this.orderUuid = orderUuid;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderReturnDate() {
        return orderReturnDate;
    }

    public void setOrderReturnDate(String orderReturnDate) {
        this.orderReturnDate = orderReturnDate;
    }

    public String getOrderSubtotal() {
        return orderSubtotal;
    }

    public void setOrderSubtotal(String orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
    }
}