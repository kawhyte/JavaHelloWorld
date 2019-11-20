package com.kennywhyte;

public class TextBox extends UIControl {

    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("Textbox");
    }

    @Override
    public String toString() {
        return text;

    }

    public void setText(String text) {

        //text =text;
        this.text = text;

    }

    public void clear() {
        this.text = "";

    }
}
