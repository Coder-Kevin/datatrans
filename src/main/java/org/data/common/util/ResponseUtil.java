package org.data.common.util;

import org.data.common.ResponseVo;
import org.data.common.consts.CommonConstants;

public class ResponseUtil {

    private ResponseUtil(){}

    public static ResponseVo success(Object data){
        return new ResponseVo(CommonConstants.SUCCESS_CODE,"操作成功",data);
    }

    public static ResponseVo success(String message){
        return new ResponseVo(CommonConstants.SUCCESS_CODE,message,null);
    }



}
