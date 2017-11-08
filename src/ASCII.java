/**
 * Created by qsm on 2017/11/7.
 *  int 四个字节
 *  char 两个字节
 *
 *
 *  当字符和数字类型  就会查询编码表
 *
 *  char转成Int类型的时候，类型自动提升， hcar数据类型 会查询编码表 得到整数
 */
public class ASCII {
    public static void main ( String[] ar ) {
        char c = 'a';   //97
        int i = c + 1;   //小转大

        System.out.println( i );  //98

        //大转小
        int j = 90;
        char d = (char)j;   //Z    强制转成char类型
        System.out.println( d );
    }
}
