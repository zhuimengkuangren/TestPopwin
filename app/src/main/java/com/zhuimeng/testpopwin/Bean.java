package com.zhuimeng.testpopwin;

/**
 * Created by zhuimeng on 2017/11/5.
 */

public class Bean {
    private String name;
    private boolean isSelected;

    public Bean(String name, boolean isSelected) {
        this.name = name;
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
