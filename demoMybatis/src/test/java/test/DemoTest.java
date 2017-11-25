package test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import java.io.Reader;

import org.apache.ibatis.executor.result.DefaultResultHandler;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.SysUserMapper;
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
			//调用不带参数的方法，返回结果用实体类封装
//			List<SysUser> list = session.selectList("dao.SysUserMapper.selectAll");
			//调用带参数的方法，返回结果用ResultHandler封装
			DefaultResultHandler resultHandler = new DefaultResultHandler();
			session.select("dao.SysUserMapper.selectByPrimaryKey", 2, resultHandler);
			System.out.println(resultHandler.getResultList().get(0));
			session.selectOne("dao.SysUserMapper.selectByPrimaryKey", 1);
//			SysUserMapper mapper = session.getMapper(SysUserMapper.class);
//			mapper.selectAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		
	}
	
	@Test
	public void test2(){
		SqlSession session = factory.openSession();
		try {
			
			SysUserMapper mapper = session.getMapper(SysUserMapper.class);
			SysUser sysUser = new SysUser();
			sysUser.setUserName("运维人员");
			sysUser.setUserEmail("yunwei@qq.com");
			sysUser.setUserPassword("123456");
			sysUser.setUserInfo("系统维护人员");
			sysUser.setCreateTime(new Date());
			mapper.insert2(sysUser);
			System.out.println(sysUser.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.commit();
			session.close();
		}
	}
	
	@Test
	public void test3(){
		SqlSession session = factory.openSession();
		try {
			
			SysUserMapper mapper = session.getMapper(SysUserMapper.class);
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("userName", "测试人员");
			map.put("userPassword", "123456");
			map.put("createTime", new Date());
			mapper.insert4(map);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.commit();
			session.close();
		}
	}
	
	@Test
	public void test4(){
		SqlSession session = factory.openSession();
		try {
			
			SysUserMapper mapper = session.getMapper(SysUserMapper.class);
			SysUser sysUser = mapper.selectByUserNameAndPassWord("admin", "123456");
			System.out.println(sysUser);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.commit();
			session.close();
		}
	}

}
