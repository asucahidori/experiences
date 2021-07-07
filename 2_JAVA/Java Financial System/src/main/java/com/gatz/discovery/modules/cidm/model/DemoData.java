package com.gatz.discovery.modules.cidm.model;

/**
 * Created by baibing on 2016/1/22.
 */
public class DemoData {
    public String name;
    public String value;

    public DemoData(String name,String value){
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
