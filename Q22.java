import java.io.*;
class Q22{
	public static void main(String[] args){
		FileWriter writer = null;
		try{
			writer = new FileWriter("text.txt");
			System.out.println(1);
		}catch(Exception e){
			System.out.println(2);
		}
			try{
				System.out.println(3);
				writer.close();
			}catch(Exception ex){}
			
		
	}
}