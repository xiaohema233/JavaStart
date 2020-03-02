package p4_6;

/*
	继承中构造方法的关系
		A:子类中所有的构造方法默认都会访问父类中空参数的构造方法
		B:为什么呢?
			因为子类会继承父类中的数据，可能还会使用父类的数据。
			所以，子类初始化之前，一定要先完成父类数据的初始化。
			
			注意：子类每一个构造方法的第一条语句默认都是：super();
*/
class Father {
    int age;

    public Father() {
        System.out.println("Father的无参构造方法");
    }

    public Father(String name) {
        System.out.println("Father的带参构造方法");
    }
}

class Son extends Father {
    public Son() {
        //super();
        System.out.println("Son的无参构造方法");
    }

    public Son(String name) {
        //super();
        System.out.println("Son的带参构造方法");
    }
}

class ExtendsDemo6 {
    public static void main(String[] args) {
        //创建对象
        Son s = new Son();
        System.out.println("------------");
        Son s2 = new Son("林青霞");
    }
}
