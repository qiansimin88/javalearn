/**
 * Created by qsm on 2017/11/1.
 * 方法的定义
 *  修饰符 返回值类型 方法名(参数列表...) {
 *      方法主体
 *      return;
 *  }
 *
 *  修饰符: public static
 *  返回值类型: 结果的数据类型
 *
 */
public class MethodDemo {
    public static void main ( String[] args ) {
        System.out.println( computedArea(2,4) );  //执行一个方法
    };
    //计算长方形的面积
    /*  1.明确方法计算后的结果的数据类型 int
    * */
    public static int computedArea ( int width, int height ){
          int area = width * height;
          return area;
    };
}

