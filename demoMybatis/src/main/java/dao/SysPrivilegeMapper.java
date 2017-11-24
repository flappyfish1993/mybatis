package dao;

import model.SysPrivilege;

public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPrivilege record);

    int insertSelective(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPrivilege record);

    int updateByPrimaryKey(SysPrivilege record);
}