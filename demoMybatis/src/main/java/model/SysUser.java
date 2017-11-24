package model;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userInfo;

    private Date createTime;

    private byte[] headImg;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
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
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserInfo() == null ? other.getUserInfo() == null : this.getUserInfo().equals(other.getUserInfo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getHeadImg() == null ? other.getHeadImg() == null : this.getHeadImg().equals(other.getHeadImg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserInfo() == null) ? 0 : getUserInfo().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getHeadImg() == null) ? 0 : getHeadImg().hashCode());
        return result;
    }
}