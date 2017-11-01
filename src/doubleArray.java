/**
 * Created by qsm on 2017/11/1.
 * 二维数组
 * int[][] arr = new int[3][4]
 * [3] 表示： 二维数组中，有三个一维数组
 * [4] 表示： 三个一维数组中，每个数组的长度是4
 */
public class doubleArray {
    public static void main ( String[] args ) {
        int[][] arr = new int[3][4];
        System.out.println( arr );   //[[I@1ebdff3b  地址
        System.out.println( arr[1] );  //[I@1ebdff3b  地址   arr[1]指的是一个 有四个长度的一维数组 所以是地址
        System.out.println( arr[1][3] );  // 0


        //最简单的声明多维数组
        int[][] arr1 = { {1,2,3}, {4,5,6} };

        System.out.println( arr1[1][2] );  //6
    }
}
