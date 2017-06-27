package com.canghailongyin.pojo;

/**
 * Created by mingl on 2017-6-27.
 */
public class Teacher {
    private Integer t_id;
    private String t_password;
    private String t_name;
    private Integer t_start_year;
    private Integer t_age;
    private String t_sex;
    private String t_course_ids;//所教课程编号
    private Integer role;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public Integer getT_start_year() {
        return t_start_year;
    }

    public void setT_start_year(Integer t_start_year) {
        this.t_start_year = t_start_year;
    }

    public Integer getT_age() {
        return t_age;
    }

    public void setT_age(Integer t_age) {
        this.t_age = t_age;
    }

    public String getT_sex() {
        return t_sex;
    }

    public void setT_sex(String t_sex) {
        this.t_sex = t_sex;
    }

    public String getT_course_ids() {
        return t_course_ids;
    }

    public void setT_course_ids(String t_course_ids) {
        this.t_course_ids = t_course_ids;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append("t_id=").append(t_id);
        sb.append(", t_password='").append(t_password).append('\'');
        sb.append(", t_name='").append(t_name).append('\'');
        sb.append(", t_start_year=").append(t_start_year);
        sb.append(", t_age=").append(t_age);
        sb.append(", t_sex='").append(t_sex).append('\'');
        sb.append(", t_course_ids='").append(t_course_ids).append('\'');
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}
