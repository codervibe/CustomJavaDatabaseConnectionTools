package com.codervibe;
/*
 * Created by Administrator on 2021/2/10
 * DateTime:2021/02/10 14:22
 * Description: 数据库连接信息界面
 * Others:
 *
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class DatabaseConnectionInfoMain extends JFrame {
   JButton button =new JButton("连接");
    public DatabaseConnectionInfoMain()  {
        super();
        setVisible(true);
        //window_coordinates_width_and_height
        setBounds(450, 200, 700, 500);
        //窗体最上方的标题类似于<title></title>
        setTitle("连接信息");
        setLayout(null);

        button.setBounds(0,0,100,30);
        add(button);
    }
}
