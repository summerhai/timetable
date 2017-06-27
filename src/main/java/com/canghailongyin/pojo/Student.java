package com.canghailongyin.pojo;

/**
 * Created by mingl on 2017-6-27.
 */
public class Student {
    private Integer s_id;
    private String s_password;
    private String id_number;
    private String s_name;
    private String s_sex;
    private Integer s_age;
    private Integer s_start_year;//入学年份
    private Integer c_id;//班级编号
    private Integer role;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public Integer getS_age() {
        return s_age;
    }

    public void setS_age(Integer s_age) {
        this.s_age = s_age;
    }

    public Integer getS_start_year() {
        return s_start_year;
    }

    public void setS_start_year(Integer s_start_year) {
        this.s_start_year = s_start_year;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("s_id=").append(s_id);
        sb.append(", s_password='").append(s_password).append('\'');
        sb.append(", id_number='").append(id_number).append('\'');
        sb.append(", s_name='").append(s_name).append('\'');
        sb.append(", s_sex='").append(s_sex).append('\'');
        sb.append(", s_age=").append(s_age);
        sb.append(", s_start_year=").append(s_start_year);
        sb.append(", c_id=").append(c_id);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}
