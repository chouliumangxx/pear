package com.buck.pear.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员实体类
 */
public class Member implements Serializable{

    //会员id
    private Long id;
    //会员名
    private String username;
    //会员密码
    private String passworld;
    //颜值
    private String saltValue;
    //创建时间
    private Date createTime;
    //修改时间
    private Date modiflyTime;
    //会员昵称
    private String nickName;
    //登录时间
    private Date loginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getSaltValue() {
        return saltValue;
    }

    public void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModiflyTime() {
        return modiflyTime;
    }

    public void setModiflyTime(Date modiflyTime) {
        this.modiflyTime = modiflyTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
