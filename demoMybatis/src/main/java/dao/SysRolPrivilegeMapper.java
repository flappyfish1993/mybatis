package dao;

import model.SysRolPrivilege;

public interface SysRolPrivilegeMapper {
    int insert(SysRolPrivilege record);

    int insertSelective(SysRolPrivilege record);
}