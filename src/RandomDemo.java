/**
 * Created by qsm on 2017/10/27.
 */
import java.util.Random;
public class RandomDemo {
    public static void main ( String[] args ) {
        Random ran  = new Random();

        //Random类中的 随机数  nextInt(写一个整数) 整数： 随机出来的范围 0 - 整数（不包含这个整数）
        int a = ran.nextInt( 899 );
        System.out.println( a );

        //产生浮点随机数  0.0 - 1.0   不包含 1.0
        Double b = ran.nextDouble();
        System.out.println( b );
    }
}
