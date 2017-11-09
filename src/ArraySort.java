/**
 * Created by qsm on 2017/11/8.
 * 数组排序
 */
public class ArraySort {
    public static void main( String[] args ) {
        int[] tempArrray = { 4, 3, 3, 2, 1};
        SelectSort( tempArrray );   //选择排序 1,2,3,3,4
//        BubbleSort( tempArrray );  //冒泡排序 1,2,3,3,4
    }

    /*选择排序
    数组中的每个元素 和其他元素进行比较换位置*/
    public static void SelectSort ( int[] array ) {
        int temp;
        for( int i = 0; i < array.length - 1; i++ ) {
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

    /*  冒泡排序
    数组相邻的比 ，比完 最大的会变成最右边的，相当于水里的气泡上升一样。然后最大的不动  在比其他的*/
    public static void BubbleSort ( int[] array ) {
        int count = array.length;
        int temp;
        while( count > 0 ) {
            for( int i = 0; i < count - 1; i++ ) {
                if( array[i] > array[i+1] ) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            count -= 1;
        }
        ShowArray( array );
    }

    public static void ShowArray ( int[] array ) {
        for( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
