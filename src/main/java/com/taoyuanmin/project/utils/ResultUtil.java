package com.taoyuanmin.project.utils;

import com.taoyuanmin.project.common.domain.Result;
import com.taoyuanmin.project.common.enums.ResultEnum;

public class ResultUtil {

	/**
	 * 成功
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Result success() {
		Result result = new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg());
		return result;
	}

	/**
	 * 成功
	 * 
	 * @param message
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Result success(String message) {
		Result result = new Result(ResultEnum.SUCCESS.getCode(), message);
		return result;
	}

	/**
	 * 成功
	 * 
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> Result<T> success(String message, T data) {
		Result<T> result = new Result<T>(ResultEnum.SUCCESS.getCode(), message, data);
		return result;
	}

	/**
	 * 成功
	 * 
	 * @param code
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> Result<T> success(String code, String message, T data) {
		Result<T> result = new Result<T>(code, message, data);
		return result;
	}

	/**
	 * 失败
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Result fail() {
		Result result = new Result(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMsg());
		return result;
	}

	/**
	 * 失败
	 * 
	 * @param message
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Result fail(String message) {
		Result result = new Result(ResultEnum.ERROR.getCode(), message);
		return result;
	}

	/**
	 * 失败
	 * 
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> Result<T> fail(String message, T data) {
		Result<T> result = new Result<T>(ResultEnum.ERROR.getCode(), message, data);
		return result;
	}

	/**
	 * 失败
	 * 
	 * @param code
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> Result<T> fail(String code, String message, T data) {
		Result<T> result = new Result<T>(code, message, data);
		return result;
	}

}
