import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LeerFichero {
	
	//La string archivo hay que escribirla con las barras no invertidas, sino te salta error
	public static HashMap<Integer,ArrayList<Integer>> crear_relacion(String archivo) throws IOException {
		String cadena;
		//Este metodo lee el archivo
		FileReader f = new FileReader(archivo); 
		//Esto metodo crea un buffer que va leyendo cadenas de caracteres
		BufferedReader b = new BufferedReader(f); 
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
		Integer codi,codi2,codi_antic;
		codi = codi2 = codi_antic = 0;
		Boolean primer = true;
		ArrayList<Integer> l = new ArrayList<Integer>();
		while((cadena = b.readLine())!=null){
	    	int i = 0;
	    	String copy = cadena;
	    	while(!(Character.isWhitespace(cadena.charAt(i)))) {
	    		++i;
	    	}
	    	String s = copy.substring(0,i);
	    	//System.out.println(s);
	    	codi = Integer.parseInt(s);
	    	String s1 = copy.substring(i+1,copy.length());
	    	//System.out.println(s1);
	    	codi2 = Integer.parseInt(s1);
	    	if(primer){
	    		codi_antic = codi;
	    		primer = false;
	    	}
	    	if(codi != codi_antic){
	    		m.put(codi_antic, l);
	    		l.clear();
	    	}
	    	l.add(codi2);
	    	codi_antic = codi;
		}
		//Cerramos el buffer
		b.close();
		return m;
	}
	
	//Metodo para ver si se encuentra el codigo en el archivo y si lo encuentra en que linea está.
	/*public static void buscaCodigo(String archivo, int codigo) throws FileNotFoundException, IOException {
		String c = String.valueOf(codigo);
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		    int lineNum = 0;
		    String codi;
		    String currentLine; //= b.readLine();
		    int trobat = -1;
		    while(((currentLine = b.readLine()) != null) || trobat == 1)
		    {
		    	++lineNum;
		    	int i = 0;
		    	String copy = currentLine;
		    	while(!(Character.isWhitespace(currentLine.charAt(i)))) {
		    		++i;
		    	}
		    	codi = copy.substring(0,i);
		    	if(codi.contentEquals(c)) {
		    		System.out.printf("Codi trobat a la línia: %d\n",lineNum);
		    		trobat = 1;
		    	}
		 
		    }
		    if (trobat != 1) System.out.printf("No existeix a l'arxiu");
		    b.close();
	}*/
	public static void printArray(ArrayList<Integer> a) throws  IOException {
		Integer list2[] = new Integer[a.size()];
		   list2 = a.toArray(list2);

		   System.out.println("Printing elements of a");

		   // let us print all the elements available in list
		   for (Integer number : list2) {
		   System.out.println("Number = " + number);
		   }
	}
	
	
	public static void main(String [] args) throws IOException {
		HashMap<Integer,ArrayList<Integer>> r = crear_relacion("/home2/users/alumnes/1193773/dades/DBLP_four_area/paper_term.txt");
		ArrayList<Integer> m = r.get(7601);
		printArray(m);
		//for (Integer number : m) {
			//   System.out.println("Number = " + number);
		//}
		   
	}

}
