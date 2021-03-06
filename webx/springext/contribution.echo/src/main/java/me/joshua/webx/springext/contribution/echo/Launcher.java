package me.joshua.webx.springext.contribution.echo;

import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.alibaba.citrus.springext.support.context.XmlApplicationContext;

/**
 * 运行示例的类
 * 
 * @author <a href="mailto:daonan.zhan@gmail.com">Joshua Zhan</a> 2012-10-5
 */
public class Launcher {

	private final static String LINE_SEPARATOR = "============================";
	private final static String GREETING_MESSAGE = "Hello World!";

	public static void main(String[] args) {
		ApplicationContext context = new XmlApplicationContext(
				new ClassPathResource("configuration.xml"));
		testEchoService(context);
	}

	public static void testEchoService(ApplicationContext context) {
		EchoService echoService = (EchoService) context.getBean("echoService");
		System.out.println();
		System.out.println(LINE_SEPARATOR);
		System.out.println(echoService.echo(GREETING_MESSAGE));
		System.out.println(LINE_SEPARATOR);
	}
}
