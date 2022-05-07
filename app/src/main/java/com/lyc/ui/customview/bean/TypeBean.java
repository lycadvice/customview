package com.lyc.ui.customview.bean;

public class TypeBean {
    // 自定义view名称
    private String title;

    // 自定义view类型
    private int type;

    public TypeBean(String title, int type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
