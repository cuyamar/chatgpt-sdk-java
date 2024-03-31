package com.codify.chatgpt.domain.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: Sky
 * 金额消耗
 */
@Data
public class DailyCost {

    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("lineItems")
    private List<LineItem> lineItems;
}
