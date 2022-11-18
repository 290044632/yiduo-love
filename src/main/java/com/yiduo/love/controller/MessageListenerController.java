package com.yiduo.love.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageListenerController {

	private static final Logger logger = LoggerFactory.getLogger(MessageListenerController.class);

	@RequestMapping("/listen")
	public String listen(HttpServletRequest request,@RequestBody(required=false) String xml) throws Exception {
		String echostr = request.getParameter("echostr");
		logger.info("���յ�΢��������Ϣ����Ϣ���ݣ�{}, ����ַ�����{}", xml, echostr);
		if (null != echostr) {
			return echostr;
		}
		return "success";
	}
}
