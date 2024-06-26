package com.codify.chatgpt.domain.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: Sky
 * 对话信息
 */
@Data
public class Choice implements Serializable {

    private long index;
    private String text;
    private Object logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;

}

