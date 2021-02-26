
package cn.tedu.hello;
/**
 * package --刚刚创建的包
 * cn.tedu.hello --包名,公司的域名倒着写,全小写,用"."隔开
 * ; --英文分号,表示一句话的结束
 */

/**
 * public class HelloWorld{}
 * public 公共的,用来修饰谁可以访问这个类
 * class --这是一个类
 * HelloWorld --给这个类起的名字,驼峰命名法,每个单词的首字母大写
 * {类的主题内容} --用来放置类的主要内容
 */
public class HelloWorld {
    /**
     * public static void main(String[] args){} --入口函数
     * static --静态的,说明这个方法是静态的
     * void --空/无,说明这个方法没有返回值
     * main --方法的名字
     * () --代表这是一个方法/函数
     * String[] args --方法的函数
     * {方法的主题内容}--- 花括号是方法的主题,其中就是我们写的
     * @param args
     */
    public static void main(String[] args) {
        /**
         * System --系统,要发出的系统指令
         * out -- 向外输出
         * println --打印后换行
         * print --打印后不换行
         */
        System.out.println("元宵节快乐!");
        System.out.println("HelloWorld!");
        System.out.println("-------------------");
    }
}
