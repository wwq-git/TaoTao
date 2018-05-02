package test.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;

import test.dubbo.itf.IpersonInfoService;

@Service
public class PersonInfoServiceImpl implements IpersonInfoService {

	public String queryPersonInfoAll() {
		System.out.println("===================================");
		System.out.println("接口实现：queryPersonInfoAll()");
		System.out.println("===================================");
		return "from PersonInfoServiceImpl : some person Info";
	}

	public String queryPersonInfoByNumber(String personNumber) {
		System.out.println("===================================");
		System.out.println("接口实现：queryPersonInfoByNumber(String personNumber)");
		System.out.println("===================================");
		return "from PersonInfoServiceImpl ：" + personNumber + " 's Info.";
	}
}