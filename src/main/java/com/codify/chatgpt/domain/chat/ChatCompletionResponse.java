package com.codify.chatgpt.domain.chat;

import com.codify.chatgpt.domain.other.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: Sky
 * 对话请求结果信息
 */
@Data
public class ChatCompletionResponse {
    /** ID */
    private String id;
    /** 对象 */
    private String object;
    /** 模型 */
    private String model;
    /** 对话 */
    private List<ChatChoice> choices;
    /** 创建 */
    private long created;
    /** 耗材 */
    private Usage usage;

    /**
     * 该指纹代表模型运行时使用的后端配置。
     * https://platform.openai.com/docs/api-reference/chat
     */
    @JsonProperty("system_fingerprint")
    private String systemFingerprint;
}
