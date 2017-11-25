package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);
    
    int insert2(SysUser record);
    
    int insert4(HashMap<String, Object> map);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);
    
/**
 *     
 * @param username
 * @param password
 * @return
 * 给参数配直@Param注解后， MyBatis就会自动将参数封装成 Map类型，@Param注解值作为 Map中的 key，因此在SQL部分就可以通过配置的注解值来使用参数。
 */
    SysUser selectByUserNameAndPassWord(@Param("userName") String username,String password);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKeyWithBLOBs(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> selectAll();
}