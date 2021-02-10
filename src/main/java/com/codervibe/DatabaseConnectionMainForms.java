package com.codervibe;
/**
 *
 * Created by Administrator on 2021/2/10
 * DateTime:2021/02/10 12:11
 * Description: 自定义连接数据库的软件
 * Others: 版本号1.0
 */

import javax.swing.*;
import java.awt.*;



/**
 * @author Administrator
 */
public class DatabaseConnectionMainForms extends JFrame {

    /**
     * JTextField  输入框
     * JButton  按钮
     */
    JButton connetionbutton = new JButton("连接");




    public DatabaseConnectionMainForms() {


        super();
        setVisible(true);
        //window_coordinates_width_and_height
        setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height);
        //窗体最上方的标题类似于<title></title>
        setTitle("java数据库连接工具");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);


        connetionbutton.setBounds(400, 0, 70, 30);
        add(connetionbutton);


        /**
         * 创建菜单栏对象
         */
        JMenuBar menuBar = new JMenuBar();
        // 将菜单栏对象添加到窗体的菜单栏中
        setJMenuBar(menuBar);

        // 创建菜单对象
        JMenu menu = new JMenu("菜单名称");
        // 将菜单对象添加到菜单栏对象中
        menuBar.add(menu);

        // 创建菜单项对象
        JMenuItem menuItem = new JMenuItem("菜单项名称");
        // 将菜单项对象添加到菜单对象中
        menu.add(menuItem);
        // 为菜单项添加事件监听器
        menuItem.addActionListener(e -> {

        });

        // 创建菜单的子菜单对象
        JMenu sonMenu = new JMenu("子菜单名称");
        // 将子菜单对象添加到上级菜单对象中
        menu.add(sonMenu);

        // 创建子菜单的菜单项对象
        JMenuItem sonMenuItem = new JMenuItem("子菜单项名称");
        // 为菜单项添加事件监听器
        sonMenuItem.addActionListener(e -> {

        });
        // 将子菜单的菜单项对象添加到子菜单对象中
        sonMenu.add(sonMenuItem);

        // 创建菜单对象
        JMenu menu2 = new JMenu("菜单名称2");
        // 将菜单对象添加到菜单栏对象中
        menuBar.add(menu2);

        // 创建菜单项对象
        JMenuItem menuItem2 = new JMenuItem("菜单项名称2");
        // 为菜单项添加事件监听器
        menuItem2.addActionListener(e -> {

        });
        // 将菜单项对象添加到菜单对象中
        menu2.add(menuItem2);

        // 创建菜单的子菜单对象
        JMenu sonMenu2 = new JMenu("子菜单名称2");
        // 将子菜单对象添加到上级菜单对象中
        menu2.add(sonMenu2);

        // 创建子菜单的菜单项对象
        JMenuItem sonMenuItem2 = new JMenuItem("子菜单项名称2");
        // 为菜单项添加事件监听器
        sonMenuItem2.addActionListener(e -> {

        });
        // 将子菜单的菜单项对象添加到子菜单对象中
        sonMenu2.add(sonMenuItem2);
        //  //将菜单加入到菜单条中





        /**
         * 连接按钮监听事件
         */
        connetionbutton.addActionListener(e -> {
            DatabaseConnectionInfoMain dcim = new DatabaseConnectionInfoMain();
 
        });


    }
}
