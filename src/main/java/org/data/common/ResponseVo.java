package org.data.common;

import lombok.Data;

@Data
public class ResponseVo {

    private String message;

    private Integer code;

    private Object data;

    public ResponseVo(){}

    public ResponseVo(Integer code, String message, Object data){
        this.data = data;
        this.message = message;
        this.code = code;
    }
}
