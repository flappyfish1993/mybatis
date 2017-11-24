package test;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Country;
import model.SysUser;

public class DemoTest {
	
	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void init(){
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	@Test
	public void test(){
		SqlSession session = factory.openSession();
		try {
			
			List<SysUser> list = session.selectList("dao.SysUserMapper.selectAll");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		
	}

}
