package com.taoyuanmin.project.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 返回值枚举类定义
 * 
 * @author taojianmin
 *
 */
public enum ResultEnum {
	SUCCESS("0000", "成功"), // 成功 0000
	ERROR("1000", "失败"), // 失败无原因1000
	ERROR_PARAM_VALUE_MISSING("2001", "参数值不能为空"), // 请求参数类：2***开始
	ERROR_PARAM_FORMAT_NOT_CORRECT("2002", "参数格式不正确"), //
	ERROR_DATA_EXCEPTION("2003", "请求数据不正确"), //

	ERROR_EXCEPTION("4000", "接口异常"), // 内部异常4***开始

	ERROR_UNLOGIN("9001", "请重新登录"), // 没有权限类9***开始

	ERROR_NETWORK_EXCEPTION("5001", "网络异常,请稍后重试");// 网络异常5***开始


	/**
	 * code
	 */
	private String code;
	/**
	 * 描述信息
	 */
	private String msg;

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	private ResultEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * 根据code获取对应的msg信息
	 * 
	 * @param code
	 * @return
	 */
	public static String getMsg(String code) {
		if (StringUtils.isBlank(code)) {
			return null;
		}
		ResultEnum eunm = ResultEnum.valueOf(code);
		return eunm.msg;
	}
}
