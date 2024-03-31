package com.codify.chatgpt.domain.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: Sky
 * 消费账单
 */
@Data
public class BillingUsage {

    @JsonProperty("object")
    private String object;

    /**
     * 账号消费账单明细
     */
    @JsonProperty("daily_costs")
    private List<DailyCost> dailyCosts;

    /**
     * 总使用金额
     */
    @JsonProperty("total_usage")
    private BigDecimal totalUsage;
}
