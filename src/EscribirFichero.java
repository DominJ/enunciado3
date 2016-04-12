package test;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class EscribirFichero {
	
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("/Users/USUARIO/Downloads/PROP/DBLP_four_area/prova.txt",false);
			HashMap<Integer,ArrayList<Integer>> n = new HashMap<Integer,ArrayList<Integer>>();
			ArrayList<Integer> r = new ArrayList<Integer>();
			r.add(234);
			r.add(111);
			r.add(892);
			int s = 90;
			n.put(s, r);
			for (int i = 0; i < n.size(); i++) {
				for (int j = 0; j < r.size(); j++){
					fw.write(s + "\t"+ r.get(j) + "\r\n");
				}
			}
			fw.close();
		}catch(IOException e){
			System.out.println("Error de:"+e);
		}
	}
}
