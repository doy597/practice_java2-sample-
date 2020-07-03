import java.util.ArrayList;
import java.io.*;

class Q7{
	public static void main(String[] args){
		SeisekiSort ss = new SeisekiSort();
		ss.sort();
		ss.display();
	}
}

class SeisekiSort{
	private BufferedReader reader;
	private ArrayList<Seiseki>list = new ArrayList<Seiseki>();

	public SeisekiSort(){
		try{
			reader = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while(  (line = reader.readLine()) !=null ){
				String code = line.substring(0, line.indexOf(",") );
				int total = Integer.parseInt(line.substring(line.indexOf(",") + 1, line.length() ));
				list.add(new Seiseki(code, total));
			}
			reader.close();

			}catch(FileNotFoundException e){
				System.out.println("FileNotFoundException Error");
			}catch(IOException e){
				System.out.println("IOException Error");
			}
		}

		public void sort(){
			for (int i = 0; i < list.size()-1; i++){
				for(int j = i+1; j<list.size(); j++){
					if(list.get(i).getTotal() < list.get(j).getTotal() ){
						swap(i,j+1);
					}
				}
			}
		}

		private void swap(int before, int after){
			Seiseki temp;
			temp = list.get(before);
			list.set(before, list.get(after));
			list.set(after, temp);
		}

		public void display(){
			for(int i=0; i<list.size(); i++){
				System.out.print(
					((Seiseki)list.get(i)).getCode());
				System.out.println("\t" +
					((Seiseki)list.get(i)).getTotal());
			}
		}
	}
	class Seiseki{
		private String code;
		private int total;

		Seiseki(String code, int total){
			this.code = code;
			this.total = total;
		}

		String getCode(){
			return code;
		}
		int getTotal(){
			return total;
		}
	}
