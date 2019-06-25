package com.njupt.pojo;

public class UserInfo {
    Integer id;
    String uname;
    String passwd;
    String gentle;
    String email;
    String city;

    public UserInfo(Integer id, String uname, String passwd, String gentle, String email, String city) {
        this.id = id;
        this.uname = uname;
        this.passwd = passwd;
        this.gentle = gentle;
        this.email = email;
        this.city = city;
    }

    public UserInfo(Integer id) {
        this.id = id;
    }

    public UserInfo(String uname) {
        this.uname = uname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGentle() {
        return gentle;
    }

    public void setGentle(String gentle) {
        this.gentle = gentle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", gentle='" + gentle + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
