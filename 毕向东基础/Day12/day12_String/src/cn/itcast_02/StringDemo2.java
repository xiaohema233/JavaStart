package cn.itcast_02;

/*
 * String s = new String(“hello”)和String s = “hello”;的区别?
 * 有。前者会创建2个对象，后者创建1个对象。
 *
 * ==:比较引用类型比较的是地址值是否相同
 * equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");//记录的是堆内存对象的地址值
        String s2 = "hello";//记录的是常量池中的地址值

//		String s1 = "hello";
//		String s2 = "hello";

        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2));// true
    }
}
