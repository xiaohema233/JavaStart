/*
	^的特点：一个数据对另一个数据位异或两次，该数本身不变。
*/
class OperatorDemo2_05 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// a = a ^ b ^ b
		System.out.println(a ^ b ^ b); //10
		//b = a ^ b ^ a
		System.out.println(a ^ b ^ a); //20
	}
}
