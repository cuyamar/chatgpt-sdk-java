package com.codify.chatgpt.domain.files;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Sky
 * 删除文件应答
 */
@Data
public class DeleteFileResponse implements Serializable {
    /** 文件ID */
    private String id;
    /** 对象；file */
    private String object;
    /** 删除；true */
    private boolean deleted;

}
