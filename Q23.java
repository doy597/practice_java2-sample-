class Q23{
	static int [] month = {1,2,3,4,5,6,7,8,9,10,11,12};
	public static void main(String[] args){
		method1();
	}

	static void method1(){
		try{
			method2();
		}catch(Exception e){
			System.out.println("in method1");
		}
	}

	static void method2(){
		try{
			System.out.println(month[12]);
		}catch(NumberFormatException ne){
			System.out.println("in method2");
		}
	}
}