package StudentTest2;

/*
	返回值类型
		基本类型:(基本类型太简单，我不准备讲解)
		引用类型：
			类:返回的是该类的对象
			抽象类:
			接口:
*/
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public Student getStudent() {
		//Student s = new Student();
		//Student ss = s;
		
		//Student s = new Student();
		//return s;
		return new Student();
	}
}

class StudentTest2 {
	public static void main(String[] args) {
		//需求：我要使用Student类中的study()方法
		//但是，这一次我的要求是，不要直接创建Student的对象
		//让你使用StudentDemo帮你创建对象
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent(); //new Student(); Student s = new Student();
		s.study();
	}
}
