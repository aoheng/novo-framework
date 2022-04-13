package com.novo.web.handler;

import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.exception.NullFieldException;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.BaseResponseProtocol;
import com.novo.framework.core.protocol.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;
import java.sql.SQLException;
import java.util.concurrent.RejectedExecutionException;


@ControllerAdvice
public class UnifiedExceptionHandler extends SpringExceptionHandler{


	/**
	 * 数据绑定
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setAutoGrowNestedPaths(true);
		binder.setAutoGrowCollectionLimit(4096);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ExceptionHandler(value=AliGenieException.class)
	@ResponseBody
	public ResponseEntity<?>  aliGenieExceptionHandler(AliGenieException e) {
		return new ResponseEntity(e.toString(), HttpStatus.valueOf(HttpServletResponse.SC_OK));
	}
	
	@Override
	@ExceptionHandler(value=NullFieldException.class)
	@ResponseBody
	public BaseResponseProtocol nullFieldExceptionHandler(NullFieldException e) {
		return this.getResponseProtocol(e);
	}
	
	@Override
	@ExceptionHandler(value=SystemException.class)
	@ResponseBody
	public BaseResponseProtocol systemExceptionHandler(SystemException e) {
		return this.getResponseProtocol(e);
	}
	
	@Override
	@ExceptionHandler(value=CustomException.class)
	@ResponseBody
	protected BaseResponseProtocol customExceptionHandler(CustomException e) {
		return this.getResponseProtocol(e);
	}
	
	@Override
	@ExceptionHandler(value=RejectedExecutionException.class)
	@ResponseBody
	protected BaseResponseProtocol rejectedExecutionExceptionHandler(RejectedExecutionException e) {
		return this.getResponseProtocol(new CustomException(ResponseMessage.CODE_PARAM_ERROR));
	}
	@Override
	@ExceptionHandler(value=BindException.class)
	@ResponseBody
	protected BaseResponseProtocol bindExceptionHandler(BindException e) {
		return this.getResponseProtocol(new CustomException("500","["+e.getFieldError().getField()+"]的值类型错误"));
	}
	
	
	
	//yushihai update 2020-11-9
    /**
     * 400 - Bad Request
     */
	@ResponseBody
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public BaseResponseProtocol handleHttpMessageNotReadableException(final HttpMessageNotReadableException e) {

    	return this.getResponseProtocol(new CustomException("900","系统错误"));
    }

    /**
     * 400 - Bad Request
     */
	@ResponseBody
    @ExceptionHandler(ValidationException.class)
    public BaseResponseProtocol handleValidationException(final ValidationException e) {

    	return this.getResponseProtocol(new CustomException("901","系统错误"));
    }

    /**
     * 400 - Bad Request
     */
    /*@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class)
    public BaseResponseProtocol handleBindException(final BindException e) {

    	return this.getResponseProtocol(new CustomException("902","系统错误"));
    }*/

    /**
     * 400 - Bad Request
     */
	@ResponseBody
    @ExceptionHandler(SQLException.class)
    public BaseResponseProtocol handleSQLException(final SQLException e) {

    	return this.getResponseProtocol(new CustomException("903","系统错误"));
    }

    /**
     * 400 - Bad Request
     */
	@ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponseProtocol handleMethodArgumentNotValidException(final MethodArgumentNotValidException e) {

    	return this.getResponseProtocol(new CustomException("904","系统错误"));
    }

    /**
     * 405 - Method Not Allowed
     */
	@ResponseBody
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public BaseResponseProtocol handleHttpRequestMethodNotSupportedException(final HttpRequestMethodNotSupportedException e) {

    	return this.getResponseProtocol(new CustomException("405","系统错误"));
    }

    /**
     * 415 - Unsupported Media Type
     */
	@ResponseBody
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public BaseResponseProtocol handleHttpMediaTypeNotSupportedException(final Exception e) {

    	return this.getResponseProtocol(new CustomException("415","系统错误"));
    }


	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseBody
	public BaseResponseProtocol handleException(final IllegalArgumentException e) {

		return this.getResponseProtocol(new CustomException("500","系统错误"));
	}

    /**
     * 500 - Internal Server Error
     */
	@ResponseBody
    @ExceptionHandler(Exception.class)
    public BaseResponseProtocol handleException(final Exception e) {

    	return this.getResponseProtocol(new CustomException("500","系统错误"));
    }

	
	
	
}
