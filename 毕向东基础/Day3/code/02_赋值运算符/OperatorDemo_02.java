/*
	赋值运算符：
		基本的赋值运算符：=
			把=右边的数据赋值给左边。
			
		扩展的赋值运算符：+=,-=,*=,/=,%=
			+= 把左边和右边做加法，然后赋值给左边。
*/
class OperatorDemo_02 {
    public static void main(String[] args) {
        // 定义一个变量
        int x = 10;

        // 其他用法
        int a, b;
        a = b = 10;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("-----------");

        // 定义一个变量
        int y = 10;
        y += 20;
        System.out.println("y:" + y);

    }
}
