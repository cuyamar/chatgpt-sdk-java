package com.codify.chatgpt.domain.whisper;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Sky
 */
@Data
public class WhisperResponse implements Serializable {
    private String text;
}
