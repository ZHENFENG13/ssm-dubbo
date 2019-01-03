package com.ssm.dubbo.api.user.entity;

import java.io.Serializable;

/**
 * @author 13
 * @project_name ssm-dubbo
 * @date 2019-01-02
 */
public class User implements Serializable{

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password="
                + password + ", roleName=" + roleName + "]";
    }

    private Integer id; // 主键
    private String userName; // 用户姓名
    private String password; // 密码
    private String roleName; //

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
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
