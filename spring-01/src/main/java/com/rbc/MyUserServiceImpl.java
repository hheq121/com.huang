package com.rbc;

public class MyUserServiceImpl  implements  MyUserService {


    private MyuserDao myuser;

    @Override
    public void show() {
        myuser.show();
    }

    public void setMyuser(MyuserDao myuser) {
        this.myuser = myuser;
    }
}
