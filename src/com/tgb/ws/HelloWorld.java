package com.tgb.ws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	String sayHi(String name);
}