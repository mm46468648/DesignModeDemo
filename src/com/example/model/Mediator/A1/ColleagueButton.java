package com.example.model.Mediator.A1;

import com.example.model.Mediator.Sample.Colleague;
import com.example.model.Mediator.Sample.Mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
    private com.example.model.Mediator.Sample.Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }
    public void setMediator(Mediator mediator) {            // 保存Mediator
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {      // Mediator下达启用/禁用的指示 
        setEnabled(enabled);
    }
}
