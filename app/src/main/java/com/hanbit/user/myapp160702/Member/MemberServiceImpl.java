package com.hanbit.user.myapp160702.Member;

import android.util.Log;

/**
 * Created by 1027 on 2016-07-09.
 */
public class MemberServiceImpl implements MemberSerivce {
    static String sessionID, sessionPW;
    @Override
    public String join(MemberBean memberBean) {
        String id = memberBean.getId();
        String pw = memberBean.getPw();
        String name = memberBean.getName();
        String email = memberBean.getEmail();
        sessionID = id;
        sessionPW = pw;
        Log.d("sent ID","id: " + id + "pw: " +pw + "name is ;" +name + "email :" +email);
        return name;
    }

    @Override
    public boolean login(MemberBean memberBean) {
        boolean loginOK =false;
        String id = memberBean.getId();
        String pw =memberBean.getPw();
        if(sessionID.equals(id) && sessionPW.equals(pw)){
            loginOK =true;
            return loginOK;
        }else {
            return loginOK;
        }
    }
}
