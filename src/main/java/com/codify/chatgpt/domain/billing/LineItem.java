package com.codify.chatgpt.domain.billing;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: Sky
 * 消费列表明细
 */
@Data
public class LineItem {
    /**
     * 模型
     */
    private String name;

    /**
     * 金额
     */
    private BigDecimal cost;
}
