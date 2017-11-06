/**
 * Created by qsm on 2017/11/5.
 * ArrayList 集合 是引用数据类型
 *  1.导入包
 *  2.创建引用数据类型的变量
 *      数据类型<存储的数据类型> 变量 = new 数据类型<>();
 *  3.ArrayList只能存引用数据类型  Byte Short Integer(int) Long Float Double Character(char) Boolean等
 */
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main( String[] args ) {
        //创建集合 指定存贮类型
        //字符串
        ArrayList<String> itemArrayList = new ArrayList <String>();

        //整形 Int
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        //存储自定义类型
        ArrayList<CustomClass> customClasses = new ArrayList<CustomClass>();


        //ArrayList  方法 add(参数)  参数和定义集合的类型一直
        itemArrayList.add("哈哈");
        itemArrayList.add("嘻嘻");
        System.out.println( itemArrayList );   //[哈哈，嘻嘻]
        //get(int index)  填索引
        System.out.println( itemArrayList.get(1) );   //嘻嘻
        //size()   返回集合的长度
        System.out.println( itemArrayList.size() );   //2




        //集合的遍历
        for( int i = 0; i < itemArrayList.size(); i++ ) {
            System.out.println( itemArrayList.get(i) );     //利用size() 和 get();
        }

        //1 add : 方法的补充  add( int 索引， 存储的元素 )   添加到指定的索引上
        itemArrayList.add( 1, "呵呵" );
        System.out.println( itemArrayList );  //[哈哈， 呵呵，嘻嘻]  嘻嘻自动变成2了

        //2 set(int 索引， 修改后得值) 将指定的索引的值改变
        itemArrayList.set(0, "hehe");
        System.out.println( itemArrayList );  //[hehe， 呵呵，嘻嘻]

        //3  remove( index )  移除指定位置的值

        //4  clear()  清空所有  变成空容器
    }
}
