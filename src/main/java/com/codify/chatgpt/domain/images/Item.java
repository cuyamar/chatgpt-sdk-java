package com.codify.chatgpt.domain.images;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author: Sky
 * 条目
 */
public class Item implements Serializable {
    private String url;
    @JsonProperty("b64_json")
    private String b64Json;

}
