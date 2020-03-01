/*
	++,--的练习题
	
	第一题：
	int a = 10;
	int b = 10;
	int c = 10;

	a = b++;
	c = --a;
	b = ++a;
	a = c--;
	请分别计算出a,b,c的值
	
	第二题：
	int x = 4;
	int y = (x++)+(++x)+(x*10);
	请分别计算出x,y的值
*/
class OperatorTest_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++; //a=10,b=11,c=10
        c = --a; //a=9,b=11,c=9
        b = ++a; //a=10,b=10,c=9
        a = c--; //a=9,b=10,c=8

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("--------------");

        int x = 4;
        int y = (x++) + (++x) + (x * 10);
        // 4+6+60
        // x=5,6

        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
}
