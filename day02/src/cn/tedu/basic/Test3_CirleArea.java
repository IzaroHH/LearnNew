package cn.tedu.basic;

import java.util.Scanner;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 11:54 2021/3/1
 * @Modified By:
 */
public class Test3_CirleArea {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double r = sc.nextDouble();
        double circleArea = PI * r * r;
        System.out.println("圆的面积:" + circleArea);
    }
}
