package test.dubbo.itf;

public interface IpersonInfoService {
	/**
	 * 查询全部人员信息
	 */
	public String queryPersonInfoAll();

	/**
	 * 根据人员编号查询人员信息
	 */
	public String queryPersonInfoByNumber(String personNumber);
}