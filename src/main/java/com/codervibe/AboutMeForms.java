package com.codervibe;
/*
 * Created by Administrator on 2021/2/12
 * DateTime:2021/02/12 9:04
 * Description:
 * Others:
 */

import javax.swing.*;

/**
 * @author Administrator
 */
public class AboutMeForms extends JFrame{
    JLabel Text =new JLabel(
            "版本: 1.0.0.0\n" +
            "作者: codevibe\n" +
            "时间: 20210210");

    public AboutMeForms() {
        super();
        setVisible(true);
        setBounds(500, 200, 400, 350);
        //窗体最上方的标题类似于<title></title>
        setTitle("关于我");
        setLayout(null);
        getContentPane().add(new JLabel("Just a test."));



        this.setSize(300,150);
        Text.setBounds(20,0,500,40);
        add(Text);


    }
}
