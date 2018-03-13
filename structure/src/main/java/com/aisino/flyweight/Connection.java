package com.aisino.flyweight;

import java.io.Serializable;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Connection implements Serializable{

    private String url;
    private String driverClass;
    private String username;
    private String password;

    public Connection() {
    }

    public Connection(String url, String driverClass, String username, String password) {

        this.url = url;
        this.driverClass = driverClass;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "url='" + url + '\'' +
                ", driverClass='" + driverClass + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
