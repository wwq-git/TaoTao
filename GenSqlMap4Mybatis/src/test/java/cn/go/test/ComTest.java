package cn.go.test;

import java.io.IOException;
/*import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;*/

/*import com.wbhl.mapper.TbOrderMapper;
import com.wbhl.pojo.TbOrder;
import com.wbhl.pojo.TbOrderExample;*/

public class ComTest {

	public static void main(String[] args) throws IOException {
		/*TbOrderExample example = new TbOrderExample();
		example.setPage(0L);
		example.setRows(10L);
		String resource = "SqlMapCOnfig.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(reader);
		SqlSession openSession = build.openSession();
		try {
			TbOrderMapper mapper = openSession.getMapper(TbOrderMapper.class);
			List<TbOrder> list = mapper.selectByExample(example);
			System.out.println(list);
			for (TbOrder TbOrder : list) {
				System.out.println(TbOrder.getId() + "," + TbOrder.getAddress());
			}
		} finally {
			openSession.close();
		}*/
	}
}
