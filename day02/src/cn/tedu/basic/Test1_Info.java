package cn.tedu.basic;

/**
 * 需求:在控制台打印:
 * java架构师XXX今年XXX岁,月薪XXX
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:51 2021/3/1
 * @Modified By:
 */
public class Test1_Info {
    /**
     * 1.创建程序的入口函数
     */
    public static void main(String[] args) {

        System.out.println("段子很火");
        String name="H";
        int age=18;
        double salary=10000.99;
        System.out.println("我叫:"+name);

        System.out.println("java架构师"+name+"今年"+age+"岁,月薪"+salary+",感慨Java是世界上最好的语言!");
    }
}
