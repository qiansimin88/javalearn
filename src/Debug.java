/**
 * Created by qsm on 2017/11/9.
 */
public class Debug {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if( i % 2 == 0 ) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
