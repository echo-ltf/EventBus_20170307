package com.example.administrator.eventbus_20170307;

/**
 * Created by Administrator on 2017/3/7.
 */
public class MessageEvent {
    private  String msg;
    public MessageEvent(String msg){
        this.msg=msg;
    }
    public String getMsg(){
        return msg;
    }
}
