package com.study.SpringBoot.forezp.c17fileupload;

//自定义异常类
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
