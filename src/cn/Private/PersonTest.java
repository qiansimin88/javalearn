package cn.Private;

/**
 * Created by qsm on 2017/11/15.
 */
public class PersonTest {
    public static void main ( String[] args ) {
        Person p = new Person();
            p.name = "qiansimin";
            //p.age = 20;
            p.setAge( 12 );
            p.speak();
    }
}
