package org.service;

public interface CustomerHTTPClient {
    public static final String URL = "";
    public abstract String sendHttpRequest(String urlString);
}
