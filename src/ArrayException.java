/**
 * Created by qsm on 2017/10/31.
 * 常见的数组异常  thread：线程
 */
public class ArrayException {
    public static void main ( String[] args ) {
        //越界
        int[] arr = { 5, 2, 1 };
        System.out.println( arr[5] );  //报错 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5

        //空指针
        int[] arr1 = { 1, 4, 2 };
        System.out.println( arr1[2] ); //2
        arr1 = null;  //强制清除薱内存地址  设为空
        System.out.println( arr1[2] ); //空指针 Exception in thread "main" java.lang.NullPointerException
    }
}
