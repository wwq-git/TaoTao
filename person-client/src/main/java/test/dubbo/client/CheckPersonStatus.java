package test.dubbo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dubbo.itf.IpersonInfoService;

@Service
public class CheckPersonStatus {
	/**
	 * 这个bean的实现来源于dubbo的服务
	 */
	@Autowired
	private IpersonInfoService personInfoService;

	public String checkAllPersonStatus() {
		return personInfoService.queryPersonInfoAll();
	}

	public String checkPersonStatusByPersonNumber(String personNumber) {
		return personInfoService.queryPersonInfoByNumber(personNumber);
	}
}