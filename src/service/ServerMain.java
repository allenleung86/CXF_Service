package service;

import javax.xml.ws.Endpoint;

import com.tgb.ws.HelloWorld;
import com.tgb.ws.impl.HelloWorldWs;

public class ServerMain {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorldWs();

		// 调用EndPoint的publish方法发布WebService
		// 调用Endpoint的publish方法发布web service 第一个参数为ip地址 ，第二v参数就是服务的提供者
		Endpoint.publish("http://localhost:9002/crazyit", hw);

		System.out.println("WebService调用成功了");
	}
}