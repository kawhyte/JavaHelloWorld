package com.kennywhyte;

import org.w3c.dom.ls.LSOutput;

public class UIControl {

    private boolean isEnabled = true;

    public void disable() {

        isEnabled = false;
    }

    public UIControl(boolean isEnabled) {

        this.isEnabled = isEnabled;
        System.out.println("UIC");
    }

    public boolean isEnabled() {

        return isEnabled;
    }

}
