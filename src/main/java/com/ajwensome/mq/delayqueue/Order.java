package com.ajwensome.mq.delayqueue;

import lombok.Data;

import java.io.Serializable;

/**
 * @author created by qwb on 2018/12/22 14:54
 */
@Data
public class Order implements Serializable{

    private static final long serialVersionUID = -2110452066839844246L;
    private String orderId;
    private Integer orderStatus;
    private String orderName;
}
