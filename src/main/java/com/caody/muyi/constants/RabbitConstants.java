package com.caody.muyi.constants;

public final class RabbitConstants {
    /**
     * 死信队列EXCHANGE名称
     */
    public static final String MQ_EXCHANGE_DEAD_QUEUE = "test-dead-queue-exchange";

    /**
     * 死信队列名称
     */
    public static final String QUEUE_NAME_DEAD_QUEUE = "test-dead-queue";

    /**
     * 死信队列路由名称
     */
    public static final String MQ_ROUTING_KEY_DEAD_QUEUE = "test-routing-key-dead-queue";

    /**
     * 发放奖励EXCHANGE名称
     */
    public static final String MQ_EXCHANGE_SEND_AWARD = "test-send-award-exchange";

    /**
     * 发放优惠券队列名称
     */
    public static final String QUEUE_NAME_SEND_COUPON = "test-send-coupon-queue";

    /**
     * 发放优惠券路由key
     */
    public static final String MQ_ROUTING_KEY_SEND_COUPON = "test-routing-key-send-coupon";
}
