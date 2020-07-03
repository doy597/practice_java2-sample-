class Q29{
	public static void main(String args[]){
		String[] characters = {"Hello","ThankYou", "Bye"};
		int sum = 0;

	for(String str : characters){
		sum += str.length();
	}
	System.out.println("Œv:" + sum);
	}
}