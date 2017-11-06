/**
 * Created by qsm on 2017/11/6.
 *  实现库存管理案列
 *  1.存储商品信息
 *      存贮商品类型变量
 *      将商品类型的变量 存贮到集合中
 *
 *  2.查看库存清单
 *      遍历集合，获取出集合中存贮的Goods遍历
 *      计算求和：总价格 总库存
 */
import java.util.ArrayList;
public class ArrayListShopping {
    public static void main( String[] args ) {
        ArrayList<Goods> goods = new ArrayList<Goods>();
        //创建集合
        collecting( goods );
        System.out.println( goods );
        viewGoods( goods );
    }

    //将商品信息 存贮到集合中
    public static void collecting( ArrayList<Goods> goods ) {
        Goods g1 = new Goods();
        Goods g2 = new Goods();

        g1.brand = "Macbook";
        g1.size = 13.3;
        g1.price = 23.23;
        g1.count = 1;


        g2.brand = "Thinkpad";
        g2.size = 213.3;
        g2.price = 33.23;
        g2.count = 3;

        goods.add( g1 );
        goods.add( g2 );
    }

    //遍历集合
    public static void viewGoods( ArrayList<Goods> goods ) {
        int totalCount = 0;
        double totalPrice = 0;

        System.out.println("------------商场库存清单-------------");
        System.out.println("品牌集合        尺寸        价格         库存数");
        for( int i = 0; i < goods.size(); i++ ) {
            Goods goosOne = goods.get(i);
            System.out.println( goosOne.brand + "     " + goosOne.size + "       " + goosOne.price + "       " + goosOne.count);
            totalCount += goosOne.count;
            totalPrice += goosOne.price * goosOne.count;
        }
        System.out.println("总价" + totalPrice);
        System.out.println("总库存数" + totalCount);
    }
}
