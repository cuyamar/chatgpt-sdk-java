package com.codify.chatgpt;

import com.codify.chatgpt.domain.chat.ChatCompletionRequest;
import com.codify.chatgpt.domain.chat.ChatCompletionResponse;
import com.codify.chatgpt.domain.qa.QACompletionRequest;
import com.codify.chatgpt.domain.qa.QACompletionResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.reactivex.Single;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Description:以 ChatGPT 官网 API 模型，定义接口。官网：https://platform.openai.com/playground
 */
public interface IOpenAiApi {

    String v1_completions = "v1/completions";
    /**
     * 文本问答
     * @param qaCompletionRequest 请求信息
     * @return                    返回结果
     */
    @POST(v1_completions)
    Single<QACompletionResponse> completions(@Body QACompletionRequest qaCompletionRequest);


    String v1_chat_completions = "v1/chat/completions";
    /**
     * 默认 GPT-3.5 问答模型
     * @param chatCompletionRequest 请求信息
     * @return                      返回结果
     */
    @POST(v1_chat_completions)
    Single<ChatCompletionResponse> completions(@Body ChatCompletionRequest chatCompletionRequest);

}
