package com.huashi.developer.model;

import com.huashi.developer.validator.ValidateField;

/**
 * 
  * TODO 单条/批量短信MODEL
  *
  * @author zhengying
  * @version V1.0.0   
  * @date 2017年3月31日 下午9:39:53
 */
public class SmsModel extends BaseModel {

	private static final long serialVersionUID = 2029866580659952586L;

	// 手机号码
	@ValidateField("mobile")
	private String mobile;

	// 短信内容
	@ValidateField(value = "content", utf8 = true, notEmpty = true)
	private String content;

	// 扩展码号
	@ValidateField(value = "extNumber", necessary = false, number = true)
	private String extNumber;

	// 备选:主要用于用户自定义内容，会原封不动的给用户返回（业务主要用于渠道区分自己的客户，可能传递的是渠道方自己的用户Id）
	@ValidateField(value = "attach", necessary = false)
	private String attach;

	// 回调URL
	@ValidateField(value = "callback", necessary = false)
	private String callback;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getExtNumber() {
		return extNumber;
	}

	public void setExtNumber(String extNumber) {
		this.extNumber = extNumber;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

}
