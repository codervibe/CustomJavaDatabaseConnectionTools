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


    public DatabaseConnectionMainForms() {
        super();
        setVisible(true);
        //window_coordinates_width_and_height
        setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height);
        //窗体最上方的标题类似于<title></title>
        setTitle("java数据库连接工具");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);


        /**
         * 创建一个菜单栏
         */
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        /*
         * 创建一级菜单
         */
        JMenu fileMenu = new JMenu("文件");
        JMenu editMenu = new JMenu("编辑");
        JMenu viewMenu = new JMenu("视图");
        JMenu aboutMenu = new JMenu("关于");
        // 一级菜单添加到菜单栏
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(aboutMenu);

        /*
         * 创建 "文件" 一级菜单的子菜单
         */
        JMenu newMenu = new JMenu("新建连接");
        JMenuItem openMenuItem = new JMenuItem("打开");
        JMenuItem exitMenuItem = new JMenuItem("退出");
        // 子菜单添加到一级菜单
        fileMenu.add(newMenu);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator();       // 添加一条分割线
        fileMenu.add(exitMenuItem);
        /*
         * 创建“新建” 的子菜单
         */
        JMenuItem mysqlConnectionJenuItem = new JMenuItem("Mysql");
        JMenuItem oracleConnectionJenuItem = new JMenuItem("oracle");
        JMenuItem sqlServerConnectionJenuItem = new JMenuItem("sqlServer");
        newMenu.add(mysqlConnectionJenuItem);
        newMenu.add(oracleConnectionJenuItem);
        newMenu.add(sqlServerConnectionJenuItem);

        /*
         * 创建 "编辑" 一级菜单的子菜单
         */
        JMenuItem copyMenuItem = new JMenuItem("复制");
        JMenuItem pasteMenuItem = new JMenuItem("粘贴");
        // 子菜单添加到一级菜单
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        /*
         * 创建 "视图" 一级菜单的子菜单
         */
        final JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("复选框子菜单");
        final JRadioButtonMenuItem radioButtonMenuItem01 = new JRadioButtonMenuItem("单选按钮子菜单01");
        final JRadioButtonMenuItem radioButtonMenuItem02 = new JRadioButtonMenuItem("单选按钮子菜单02");
        // 子菜单添加到一级菜单
        viewMenu.add(checkBoxMenuItem);
        viewMenu.addSeparator();                // 添加一个分割线
        viewMenu.add(radioButtonMenuItem01);
        viewMenu.add(radioButtonMenuItem02);

        // 其中两个 单选按钮子菜单，要实现单选按钮的效果，需要将它们放到一个按钮组中
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioButtonMenuItem01);
        btnGroup.add(radioButtonMenuItem02);

        // 默认第一个单选按钮子菜单选中
        radioButtonMenuItem01.setSelected(true);

        //添加关于子菜单
        JMenuItem aboutOurMenuItem = new JMenuItem("关于我");
        //将子菜单添加进关于菜单
        aboutMenu.add(aboutOurMenuItem);



        /*
         * 菜单项的点击/状态改变事件监听，事件监听可以直接设置在具体的子菜单上（这里只设置其中几个）
         */
        /**
         * mysql 数据库 连接监听事件
         */
       mysqlConnectionJenuItem.addActionListener(e -> {

           DatabaseConnectionInfoMain databaseConnectionInfoMain = new DatabaseConnectionInfoMain();



       });
        /**
         * 关于我子菜单监听事件
         */
        aboutOurMenuItem.addActionListener(e -> {
            AboutMeForms aboutMeForms=new AboutMeForms();
            System.out.println("版本 1.0.0.0");
            System.out.println("作者 codevibe");
            System.out.println("时间 20210210");
        });

        /**
         * 退出按钮监听事件
         */
        exitMenuItem.addActionListener(e -> {

            dispose();
        });























    }
}
