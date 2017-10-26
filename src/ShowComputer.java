/**
 * Created by qsm on 2017/10/26.
 * 写一个库存案例 控制台打出来
 */
public class ShowComputer {
    public static void main ( String[] args ) {
        System.out.println( "----------------商城库存清单--------------" );
        System.out.println( "品牌型号        尺寸         价格        库存数" );

        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        int macCount = 5;

        String ThinkBrand = "ThinkPadT450";
        double ThinkSize = 14;
        double ThinkPrice = 5999.99;
        int ThinkCount = 23;

        System.out.println( macBrand + "       " +   macSize  + "       " +  macPrice + "       " +  macCount);
        System.out.println( ThinkBrand + "     " +  ThinkSize  + "       " +  ThinkPrice + "       " +  ThinkCount);


        int totalCount = macCount + ThinkCount;
        double totalPrice = macCount * macPrice + ThinkPrice * ThinkCount;
        System.out.println( "总库存数：" +  totalCount);
        System.out.println( "总价格：" +  totalPrice);
    }
}
