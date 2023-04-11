package com.battle.common.exception;

import com.alibaba.fastjson.JSON;
import com.battle.common.returnData.ResultData;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @Author kinds
 * @Date 2023/4/12 0:36
 * @Description
 */
@ControllerAdvice
@RestController
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 非法参数验证异常
     *
     * @param ex MethodArgumentNotValidException
     * @return ResultData
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResultData handleMethodArgumentNotValidExceptionHandler(
            MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        List<String> list = new ArrayList<>();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            list.add(fieldError.getDefaultMessage());
        }
        Collections.sort(list);
        log.error("fieldErrors:[ex:{}]", JSON.toJSONString(list));
        return ResultData.fail(ExceptionEnums.MethodArgumentNotValidException.getCode(), ExceptionEnums.MethodArgumentNotValidException.getMessage(), list);
    }

//    /**
//     * 系统登录异常处理
//     *
//     * @param exception exception
//     * @return res
//     */
//    @ExceptionHandler(value = SysLoginException.class)
//    @ResponseStatus(HttpStatus.OK)
//    public ApiResult sysLoginExceptionHandler(SysLoginException exception) {
//        log.warn("sysLoginExceptionHandler:系统登录异常[exception:{}]", exception.getMessage());
//        return ApiResult.fail(ApiCode.LOGIN_EXCEPTION);
//    }

    /**
     * HTTP解析请求参数异常
     *
     * @param e e
     * @return ResultData
     */
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResultData httpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error("httpMessageNotReadableException:[e:{}]", e.getMessage());
        return ResultData.fail(ExceptionEnums.HttpMessageNotReadableException.getCode(), ExceptionEnums.HttpMessageNotReadableException.getMessage());
    }

    /**
     * HTTP 请求Content-Type属性设置错误
     *
     * @param e HttpMediaTypeException
     * @return ResultData
     */
    @ExceptionHandler(value = HttpMediaTypeException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResultData httpMediaTypeException(HttpMediaTypeException e) {
//        log.error("httpMediaTypeException:[exception:{}]", e.getSupportedMediaTypes());
        return ResultData.fail(ExceptionEnums.HttpMediaTypeException.getCode(), ExceptionEnums.HttpMediaTypeException.getMessage());
    }
//
//    /**
//     * 自定义业务/数据异常处理
//     *
//     * @param exception exception
//     * @return res
//     */
//    @ExceptionHandler(value = {SpringBootPlusException.class})
//    @ResponseStatus(HttpStatus.OK)
//    public ApiResult springBootPlusExceptionHandler(SpringBootPlusException exception) {
//        log.error("springBootPlusException:[exception:{}]", exception.getMessage());
//        int errorCode;
//        if (exception instanceof BusinessException) {
//            errorCode = ApiCode.BUSINESS_EXCEPTION.getCode();
//        } else if (exception instanceof DaoException) {
//            errorCode = ApiCode.DAO_EXCEPTION.getCode();
//        } else if (exception instanceof VerificationCodeException) {
//            errorCode = ApiCode.VERIFICATION_CODE_EXCEPTION.getCode();
//        } else {
//            errorCode = ApiCode.SPRING_BOOT_PLUS_EXCEPTION.getCode();
//        }
//        return new ApiResult().setCode(errorCode).setMsg(exception.getMessage());
//    }
//
//    /**
//     * 登陆授权异常处理
//     *
//     * @param exception exception
//     * @return res
//     */
//    @ExceptionHandler(value = AuthenticationException.class)
//    @ResponseStatus(HttpStatus.OK)
//    public ApiResult authenticationExceptionHandler(AuthenticationException exception) {
//        log.error("authenticationExceptionHandler:[exception:{}]", exception.getMessage());
//        return new ApiResult()
//                .setCode(ApiCode.AUTHENTICATION_EXCEPTION.getCode())
//                .setMsg(exception.getMessage());
//    }
//
//    /**
//     * 未认证异常处理
//     *
//     * @param exception exception
//     * @return res
//     */
//    @ExceptionHandler(value = UnauthenticatedException.class)
//    @ResponseStatus(HttpStatus.OK)
//    public ApiResult unauthenticatedExceptionHandler(UnauthenticatedException exception) {
//        log.error("unauthenticatedExceptionHandler:[exception:{}]", exception.getMessage());
//        return ApiResult.fail(ApiCode.UNAUTHENTICATED_EXCEPTION);
//    }
//
//    /**
//     * 未授权异常处理
//     *
//     * @param exception exception
//     * @return res
//     */
//    @ExceptionHandler(value = UnauthorizedException.class)
//    @ResponseStatus(HttpStatus.OK)
//    public ApiResult unauthorizedExceptionHandler(UnauthorizedException exception) {
//        log.error("unauthorizedExceptionHandler:[exception:{}]", exception.getMessage());
//        return ApiResult.fail(ApiCode.UNAUTHORIZED_EXCEPTION);
//    }
//
    /**
     * SQL 语法异常
     *
     * @param exception exception
     * @return res
     */
    @ExceptionHandler(value = BadSqlGrammarException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResultData badSqlGrammarException(BadSqlGrammarException exception) {
        log.info("badSqlGrammarException:[exception:{}]", exception.getMessage());
        return ResultData.fail(ExceptionEnums.BadSqlGrammarException.getCode(), ExceptionEnums.BadSqlGrammarException.getMessage());
    }
    /**
     * 默认的异常处理
     *
     * @param exception exception
     * @return ResultData
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public ResultData exceptionHandler(Exception exception) {
        log.error("exceptionHandler:[exception:{}]", exception.getMessage());
        if (Objects.nonNull(exception.getMessage())) {
            return ResultData.fail(exception.getMessage());
        }
        return ResultData.fail(ExceptionEnums.RuntimeException.getCode(), ExceptionEnums.RuntimeException.getMessage(), ExceptionEnums.RuntimeException.getMessage());
    }
}
