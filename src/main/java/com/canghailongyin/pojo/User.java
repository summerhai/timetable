package com.canghailongyin.pojo;

/**
 * Created by mingyue on 2017/6/27.
 */
public class User {
    private Integer u_id;
    private String u_account;
    private String u_password;
    private String u_create_time;
    private Integer u_available;
    private String role;
    private Integer u_type_id;//关联学生、教师、管理员编号

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_account() {
        return u_account;
    }

    public void setU_account(String u_account) {
        this.u_account = u_account;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_create_time() {
        return u_create_time;
    }

    public void setU_create_time(String u_create_time) {
        this.u_create_time = u_create_time;
    }

    public Integer getU_available() {
        return u_available;
    }

    public void setU_available(Integer u_available) {
        this.u_available = u_available;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getU_type_id() {
        return u_type_id;
    }

    public void setU_type_id(Integer u_type_id) {
        this.u_type_id = u_type_id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("u_id=").append(u_id);
        sb.append(", u_account='").append(u_account).append('\'');
        sb.append(", u_password='").append(u_password).append('\'');
        sb.append(", u_create_time='").append(u_create_time).append('\'');
        sb.append(", u_available=").append(u_available);
        sb.append(", role='").append(role).append('\'');
        sb.append(", u_type_id=").append(u_type_id);
        sb.append('}');
        return sb.toString();
    }
}
