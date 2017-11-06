/**
 * Created by qsm on 2017/10/31.
 * 定义数组容器，强制数据类型
 * 必须有数据类型 大小，就是数据的个数，个数是恒定的 是不能变化的
 * 数据类型[] 变量名  = new 数据类型[存储的个数]
 *
 *
 */
public class   ArrayDemo {
    public static void main ( String[] args ) {
        int[] arr = new int[3];
        System.out.println(arr[0]);  //0  默认都是0
        System.out.println( arr.length );

        int[] arr1 = new int[]{77,79,100};  //直接赋值【】不能写任何数值
        System.out.println( arr1[0] );


        int[] arr2 = {2,3,4};  //简写形式,方便简单
        System.out.println( arr2[1] );  //3


        //赋值
        int[] arr3 = new int[5];
        arr3[1] = 2222;
        System.out.println(arr3[1]);  //2222
    }
}
