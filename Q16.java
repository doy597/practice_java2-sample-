class Q16{
	public static void main(String[] args){
		B obj = new B();
	}
}

class A{
	A(){
		System.out.println("Aクラス");
	}
}
class B extends A{
	B(){
		System.out.println("Bクラス");
	}
}