import java.io.*;

class Q6{
public static void main(String[] args){
	String fileName = "address.txt";

	try{
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
	while ((line = reader.readLine()) != null){
		MailAddress mail = new MailAddress(line);
		System.out.println(mail.getMailAddress());
	}
	reader.close();
	}catch(FileNotFoundException e){}
	catch(IOException e){}
	}

	enum Type{FIRST, LAST, ONLY}

	public class MailAddress{
		private String mailLine;
		private int kakkoStart = 0, kakkoEnd = 0;

	public MailAddress(String mailLine){
		this.mailLine = mailLine;
	}

	public String getMailAddress(){
		switch(getType()){
			case FIRST:
				return mailLine.substring(kakkoStart,kakkoEnd);
			caseLAST:
				return mailLine.substring(kakkoStart + 1, kakkoEnd);
			default:
				return mailLine;
		}
	}
	private Type getType(){
		if(  (kakkoStart = mailLine.indexOf("<")  ) >= 0 ){
			kakkoEnd = mailLine.indexOf(">", kakkoStart);
			return Type.LAST;
		}else if(  (kakkoEnd = mailLine.indexOf("(") ) >=0  ){
			kakkoStart = 0;
			return Type.FIRST;
		}else{
			return Type.ONLY;
		}
	}
}
}