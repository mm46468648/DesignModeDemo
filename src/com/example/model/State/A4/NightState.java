package com.example.model.State.A4;

import com.example.model.State.Sample.Context;
import com.example.model.State.Sample.DayState;
import com.example.model.State.Sample.State;

public class NightState implements com.example.model.State.Sample.State {
    private static NightState singleton = new NightState();
    private NightState() {                              // 构造函数的可见性是private
    }
    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }
    public void doClock(com.example.model.State.Sample.Context context, int hour) {    // 设置时间
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(com.example.model.State.Sample.Context context) {                // 使用金库
        context.callSecurityCenter("紧急：晚上使用金库！");
    }
    public void doAlarm(com.example.model.State.Sample.Context context) {              // 按下警铃
        context.callSecurityCenter("按下警铃(晚上)");
        context.changeState(UrgentState.getInstance()); 
    }
    public void doPhone(Context context) {              // 正常通话
        context.recordLog("晚上的通话录音");
    }
    public String toString() {                          // 显示字符串
        return "[晚上]";
    }
}
