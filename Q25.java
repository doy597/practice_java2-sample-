class Q25{
	public static void main(String[] args){
		int x = 1;
		boolean result = (x++ ==1 || ++x ==1);
		System.out.println(result);
	}
}