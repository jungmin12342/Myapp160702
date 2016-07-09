package com.hanbit.user.myapp160702.class_implement;

/**
 * Created by 1027 on 2016-07-09.
 */
public class KaupServiceImpl implements KaupService {
    String a = "h";
    public String excute(int length, int weight){
        return a;
    }
    public  String excute(KaupBean kaupBean){
        return ""+kaupBean.getHeight();
    }
}
