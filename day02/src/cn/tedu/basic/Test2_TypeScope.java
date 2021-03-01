package cn.tedu.basic;

/**
 * 本类用来查看基本类型的最大值与最小值
 *
 * @Author:Izaro
 * @Description:
 * @Date:Created in 11:22 2021/3/1
 * @Modified By:
 */
public class Test2_TypeScope {
    public static void main(String[] args) {
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byte类型的最大值是:" + byteMax);
        System.out.println("byte类型的最小值是:" + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("short类型的最大值是:" + shortMax);
        System.out.println("short类型的最大值是:" + shortMin);

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("long类型的最大值是:" + longMax);
        System.out.println("long类型的最大值是:" + longMin);

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("float类型的最大值是:" + floatMax);
        System.out.println("float类型的最大值是:" + floatMin);

        double doubleMax = Float.MAX_VALUE;
        double doubleMin = Float.MIN_VALUE;
        System.out.println("double类型的最大值是:" + doubleMax);
        System.out.println("double类型的最大值是:" + doubleMin);

        boolean b1=true;
        boolean b2 =false;
    }
}
