package test.dubbo;

import com.alibaba.dubbo.container.Main;

public class StartDubboServer {
	public static void main(String[] args) {
		/**
		 * 通过dubbo的启动程序，自动加载一个spring的context文件； 配置文件默认指定路径为
		 * resources/META-INF/spring/applicationContext.xml
		 */
		Main.main(null);
	}
}
