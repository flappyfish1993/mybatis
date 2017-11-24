package model;

import java.io.Serializable;

public class SysPrivilege implements Serializable {
    private Integer id;

    private String privilegeName;

    private String privilegeUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysPrivilege other = (SysPrivilege) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrivilegeName() == null ? other.getPrivilegeName() == null : this.getPrivilegeName().equals(other.getPrivilegeName()))
            && (this.getPrivilegeUrl() == null ? other.getPrivilegeUrl() == null : this.getPrivilegeUrl().equals(other.getPrivilegeUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrivilegeName() == null) ? 0 : getPrivilegeName().hashCode());
        result = prime * result + ((getPrivilegeUrl() == null) ? 0 : getPrivilegeUrl().hashCode());
        return result;
    }
}