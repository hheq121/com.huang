package com.huang08.pojo;



public class User {

    private int id;
    private String userName;
    private String passWord;
    private String realName;

    public User(int id, String userName, String passWord, String realName) {
        this.setId(id);
        this.setUserName(userName);
        this.setPassWord(passWord);
        this.setRealName(realName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String readName) {
        this.realName = readName;
    }
}
