package com.novo.framework.core.protocol;

public enum ResponseMessage implements Message {

	CODE_SUCCESS("00", "成功", true),

	CODE_FAIL("10", "处理失败", false),

	CODE_SIGN_ERROR("11", "签名错误", false),

	CODE_PARAM_ERROR("12", "参数错误", false),

	CODE_PWD_ERROR("13", "密码错误", false),

	CODE_EXIST("14", "已存在", false),

	CODE_EXIST_ACCOUNT("15", "账号已存在", false),

	CODE_NOTEXIST_ACCOUNT("16", "账号不存在", false),
	
	CODE_EXIST_ACTIVATION("17","设备已被绑定",false),

	CODE_REGISTER_ERROR("18", "注册失败", false),

	CODE_SMS_ERROR("19", "验证码错误", false),

	CODE_TIME_ERROR("20", "请求网络超时", false),

	CODE_PRICE_ERROR("21", "支付金额为不能0", false),
	CODE_ORDER_PRICE_ERROR("1200","下单金额与合同有误!",false),
	CODE_COUPON_REPEAT_ERROR("22", "不能重复领取", false),

	CODE_COUPON_OUTDATED_ERROR("23", "优惠券已过期", false),

	CODE_COUPON_OUT_ERROR("24", "优惠券已被领完", false),

	CODE_COUPON_NO_ERROR("25", "优惠券不存在", false),
	
	CODE_ORDER_NO_ERROR("26", "订单不存在", false),
	
	CODE_UPDATE_ERROR("27", "修改失败", false),
	
	CODE_MOBILE_EXIST("28", "手机号码已被注册", false),
	
	CODE_ACCOUNT_ERROR("29", "余额不足,请选择其他支付方式", false),
	
	CODE_PAY_ERROR("30", "支付失败", false),
	
	CODE_BALANCE_ERROR("31", "余额不足,请更换支付方式", false),
	
	CODE_REDIS_ERROR("32", "redis未取到值", false),
	
	CODE_ORDER_AREADY_PAY_ERROR("33", "订单已支付", false),
	
	ORDER_CODE_AREADY_APPROVE("34", "订单已审核", false),
	
	CODE_AFTERSALE_AREADY_SUBMIT("35", "申请审核中", false),
	
	CODE_COUPON_EXPIRE("36", "优惠券已过期", false),

	CODE_ORDER_AREADY_CANCEL("37", "订单已取消", false),

	CODE_DEVICE_NOT_EXIST("38", "设备不存在", false),

	NO_BALANCEAMOUNT("39", "支付失败，余额不足", false),

	NO_CUSTOMERID("40", "customerId错误", false),

	CODE_REBATE_STRATEGY__EXIST("50", "层级已存在该策略", false),

	CODE_LEVEL_ERROR("60", "上级层级列表为空！", false),

	CODE_CALCMSG_ERROR("70", "生成calcMsg失败", false),

	NET_ERROR("80", "网路通讯异常", false),

	DEVICESN_ERROR("81", "设备SN输入有误", false),

	ONLINE_ERROR("82", "设备未上电", false),

	REBIND_ERROR("83", "请勿重复添加设备", false),

	CODE_NUMBER("245", "修改后可用数量不能小于0", false),

	ORGCODE_ERROR("00", "组织编码不能为空！", true),

	UNKNOWN_ERROR("-1", "未知错误", false),

	CODE_FIELD_NOT_BE_NULL("502", "{field}不能为空!", false),

	HTTP_MESSAGE_NOT_READABLE("900", "信息不能读", false),

	DATA_VALIDATION_FAILURE("901", "数据不合法错误", false),

	DATA_BIND_VALIDATION_FAILURE("902", "数据绑定错误", false),

	SQL_EXECUTE_FAILURE("903", "执行数据库错误", false),

	METHOD_ARGUMENT_NOT_VALID("904", "方法参数不合法", false),

	BAD_REQUEST("400", "找不到http链接", false),

	UNAUTHORIZED("401", "登录用户没有权限，请联系管理员", false),

	FORBIDDEN("403", "禁止访问", false),

	NOT_FOUND("404", "找不到页面", false),

	METHOD_NOT_ALLOWED("405", "访问不允许访问", false),

	UNSUPPORTED_MEDIA_TYPE("415", "支持访问类型", false),

	INTERNAL_SERVER_ERROR("500", "服务器异常", false),
	
	CODE_CUSTOMER_BATCH_ERROR("10099","批量客户信息为空",false),
	CODE_ACCOUNTBUILD_ERROR("50001", "生成客户账户信息错误!", false),
	CODE_SYSTEM_ERROR("501", "系统内部错误!", false),
	CODE_TARGET_DATA_IS_NULL("data_404","目标数据不存在!",false),
	
	interface_not_create("interface_200","系统接口管理尚未创建",true),
	TIME_STAMP_TIME_OUT_ERROR("888", "时间戳超时", false),
	SESSION_TIMEOUT( "error0002","session已失效!请重新登录!",false);

	private String code;
	private String message;
	private Boolean status;

	private ResponseMessage(String code, String message, Boolean status) {
		this.code = code;
		this.message = message;
		this.status = status;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public Boolean getStatus() {
		return this.status;
	}

}
