package com.tgb.ws.impl;

import java.util.Date;
import javax.jws.WebService;
import com.tgb.ws.HelloWorld;

@WebService(endpointInterface = "com.tgb.ws.HelloWorld", serviceName = "HelloWorldWs")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHi(String name) {
		return name + ".您好" + "现在时间是：" + new Date();
	}
}