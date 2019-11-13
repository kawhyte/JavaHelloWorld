package com.kennywhyte;

public class Browser {


    public void navigate(String address) {

        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "124.679.35.1";
    }

}
