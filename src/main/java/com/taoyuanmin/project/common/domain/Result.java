package com.taoyuanmin.project.common.domain;

/**
 * 返回JSON的封装类
 * 
 * @author taojianmin
 *
 * @param <T>
 */
public class Result<T> {

	/**
	 * 返回code
	 */
	private String code;

	/**
	 * 描述信息
	 */
	private String message;

	/**
	 * 数据，可为null
	 */
	private T data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/**
	 * 构造函数
	 */
	public Result() {
	}

	/**
	 * 构造函数
	 */
	public Result(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * 构造函数
	 */
	public Result(String code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

}
