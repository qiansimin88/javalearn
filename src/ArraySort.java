/**
 * Created by qsm on 2017/11/8.
 * 数组排序
 */
public class ArraySort {
    public static void main( String[] args ) {
        int[] tempArrray = { 4, 3, 2, 1};
        SelectSort( tempArrray );   //选择排序
    }

    /*选择排序
    数组中的每个元素 和其他元素进行比较换位置*/
    public static void SelectSort ( int[] array ) {
        int temp;
        for( int i = 0; i < array.length; i++ ) {
            for( int j = i+1; j < array.length; j++ ) {
                if( array[i] > array[j] ) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        };
        ShowArray( array );
    }

    public static void ShowArray ( int[] array ) {
        for( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
