/*
	猫狗案例
		具体事物：猫，狗
		共性：姓名，年龄，吃饭

	分析：从具体到抽象
		猫:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭(猫吃鱼)
			
		狗:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭(狗吃肉)
			
		因为有共性的内容，所以就提取了一个父类。动物。
		但是又由于吃饭的内容不一样，所以吃饭的方法是抽象的，
		而方法是抽象的类，类就必须定义为抽象类。
		
		抽象动物类：
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();
	
	实现：从抽象到具体
		动物类:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();
			
		狗类：
			继承自动物类
			重写吃饭();
			
		猫类：
			继承自动物类
			重写吃饭();
*/
//定义抽象的动物类
abstract class Animal {
	//姓名
	private String name;
	//年龄
	private int age;
	
	public Animal() {}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//定义一个抽象方法
	public abstract void eat();
}

//定义具体的狗类
class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("狗吃肉");
	}
}

//定义具体的猫类
class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

//测试类
class AbstractTest {
	public static void main(String[] args) {
		//测试狗类
		//具体类用法
		//方式1：
		Dog d = new Dog();
		d.setName("旺财");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//方式2：
		Dog d2 = new Dog("旺财",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal a = new Dog();
		a.setName("旺财");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal a2 = new Dog("旺财",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//练习：测试猫类
	}
}
