package com.codervibe.untils;
/*
 * Created by Administrator on 2021/2/10
 * DateTime:2021/02/10 14:44
 * Description:
 * Others:
 */

import java.awt.*;

/**
 * @author Administrator
 */
public class Screen {
    private int screenWidth;
    private int screenHeight;
    public  void setScreenWidth(int screenWidth){
        this.screenWidth=screenWidth;
    }
    public void setScreenHeight(int screenHeight){
        this.screenHeight=screenHeight;
    }
    public int getScreenWidth() {
        setScreenWidth((int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
        return screenWidth;
    }
    public int getScreenHeight() {
        setScreenHeight((int) Toolkit.getDefaultToolkit().getScreenSize().height);
        return screenHeight;
    }
}
