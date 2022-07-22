package com.mosh.bigo.objectoriented.coupling;

public class Browser {
    public void navigate (String address) {
        String ip = findIpAdress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html> " + ip + "</html>";
    }

    private String findIpAdress(String address) {
        return "The IP address is 127.0.1.5";
    }
}
