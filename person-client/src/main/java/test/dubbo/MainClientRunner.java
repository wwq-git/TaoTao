package test.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.dubbo.client.CheckPersonStatus;

public class MainClientRunner {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
		/**
		 * 启动spring容器，同时也会启动dubbo的客户端
		 */
		context.start();
		/**
		 * 获取bean
		 */
		CheckPersonStatus checkPersonStatus = (CheckPersonStatus) context.getBean("checkPersonStatus");
		/** 调用checkPersonStatus，checkPersonStatus调用了dubbo服务 **/
		String allInfo = checkPersonStatus.checkAllPersonStatus();
		String oneInfo = checkPersonStatus.checkPersonStatusByPersonNumber("12345678");
		System.out.println(allInfo);
		System.out.println(oneInfo);

		try {
			Thread.sleep(3600 * 24);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/**
		 * 关闭spring的容器
		 */
		context.close();
	}
}
