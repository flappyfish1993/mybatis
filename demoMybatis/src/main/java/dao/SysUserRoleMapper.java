package dao;

import model.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}