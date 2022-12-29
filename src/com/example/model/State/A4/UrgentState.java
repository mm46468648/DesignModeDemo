package com.example.model.State.A4;

import com.example.model.State.Sample.Context;
import com.example.model.State.Sample.State;

public class UrgentState implements com.example.model.State.Sample.State {
    private static UrgentState singleton = new UrgentState();
    private UrgentState() {                             // 构造函数的可见性是private
    }
    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }
    public void doClock(com.example.model.State.Sample.Context context, int hour) {    // 设置时间
        // 在设置时间处理中什么都不做                                 
    }                                                                   
    public void doUse(com.example.model.State.Sample.Context context) {                // 使用金库
        context.callSecurityCenter("紧急:紧急时使用金库！");
    }
    public void doAlarm(com.example.model.State.Sample.Context context) {              // 按下警铃
        context.callSecurityCenter("按下警铃(紧急时)");
    }
    public void doPhone(Context context) {              // 正常通话
        context.callSecurityCenter("正常通话(紧急时)");
    }
    public String toString() {                          // 显示字符串
        return "[紧急时]";
    }
}
