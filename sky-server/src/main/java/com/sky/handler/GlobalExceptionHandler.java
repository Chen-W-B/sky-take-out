package com.sky.handler;

import com.sky.constant.MessageConstant;
import com.sky.exception.BaseException;
import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理器，处理项目中抛出的业务异常
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result exceptionHandler(BaseException ex){
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }

    /**
     * 处理SQL异常
     * @param ex
     * @return
    * */
    @ExceptionHandler
    public Result exceptionHandler(SQLIntegrityConstraintViolationException ex){
        //Duplicate entry 'zhangsan' for key 'idx_username' 用户名唯一，不能重复
        String message = ex.getMessage();
        //log.info("异常信息为：{}",message); //异常信息为：Duplicate entry 'zhangsan' for key 'idx_username'
        if(message.contains("Duplicate entry")){//contains方法用于检查一个字符串是否包含另一个字符串，如果包含，返回true；否则返回false
            //split方法用于根据给定的正则表达式将字符串分割成子字符串。返回一个字符串数组，其中包含分割后的子字符串。
            String[] split = message.split(" ");//根据" "分割字符串，split[0]=Duplicate，split[1]=entry，split[2]='zhangsan'
            String msg = split[2] + MessageConstant.ALREADY_EXISTS;
            return Result.error(msg);
        }else {
            return Result.error(MessageConstant.UNKNOWN_ERROR);
        }
    }

}
