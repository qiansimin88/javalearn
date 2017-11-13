package SuperMarket;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by qsm on 2017/11/12.
 * 超时管理系统 主类
 * 实现
 *  1.商品数据的初始化
 *  2.用户的菜单选择
 *  3.根据选择执行不同的行为
 *      3.1  create 添加
 *      3.2 update 修改商品
 *      3.3 read 查看
 *      3.4 delete 删除
 */

public class Shop {
    public static void main(String[] args) {
        //ArrayList只能存 引用类型  引入自定义类
        ArrayList<FruitItem> array = new ArrayList<FruitItem>();
        init( array );
//        System.out.println( array );
        while ( true ) {
            menu();
            int choose = chooseItem();
            switch( choose ) {
                case 1:
                    showFruitList( array );
                    break;
                case 2:
                    addFruit( array );
                    break;
                case 3:
                    deleteFruit( array );
                    break;
            }
        }

    }
    /*接受用户键盘输入
    返回编号*/
    public static int chooseItem () {
        Scanner sc = new Scanner(System.in);
        //返回用户输出
        return sc.nextInt();
    }

    //主菜单
    public static void menu() {
        System.out.println();
        System.out.println("===============欢迎光临==================");
        System.out.println("1：货物清单 2：添加货物 3：删除货物 4：修改货物 5：退出");
        System.out.println("请您输入操作的序号：");
    }

    //货物清单
    public static void showFruitList(ArrayList<FruitItem> a) {
        System.out.println();
        System.out.println("===============商品清单=================");
        for (int i = 0; i < a.size(); i++) {
            FruitItem item = a.get(i);
            System.out.println(item.Id + " " + item.name + " " + item.price);
        }
    }

    //添加
    public static void addFruit( ArrayList<FruitItem> a ) {
        System.out.println("选择的是添加商品");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的编号");
        int Id = sc.nextInt();
        System.out.println("请输入商品的名字");
        String name = sc.next();
        System.out.println("请输入商品的单价");
        double price = sc.nextDouble();

        //新增一个实例
        FruitItem item = new FruitItem();
        item.Id = Id;
        item.name = name;
        item.price = price;

        //添加
        a.add( item );
    }

    //删除
    public static void deleteFruit( ArrayList<FruitItem> a ) {
        System.out.println("选择的是删除商品");
        System.out.println("请输入删除商品的ID");
        Scanner sc = new Scanner(System.in);
                int Id = sc.nextInt();

        for (int i = 0; i < a.size(); i++) {
            FruitItem item = a.get(i);
            if( Id == item.Id ) {
                a.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        //假如都没找到
        System.out.println("没找到您输入的编号");
    }

  /*  实现商品数据初始化
    先将一部分数据 存贮到集合*/
    public static void init ( ArrayList<FruitItem> a ) {
        //定义一个 水果类型
        FruitItem f1 = new FruitItem();
            f1.Id = 9527;
            f1.name = "少林寺粗饼核桃";
            f1.price = 12.7;

        FruitItem f2 = new FruitItem();
            f2.Id = 9528;
            f2.name = "巢湖咸鱼";
            f2.price = 122.7;

        FruitItem f3 = new FruitItem();
            f3.Id = 9529;
            f3.name = "合肥萝卜";
            f3.price = 23.34;

        //2.存贮
        a.add(f1);
        a.add(f2);
        a.add(f3);
    }
}
