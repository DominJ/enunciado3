import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	//La string archivo hay que escribirla con las barras no invertidas, sino te salta error
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
		String cadena;
		//Este metodo lee el archivo
		FileReader f = new FileReader(archivo); 
		//Esto metodo crea un buffer que va leyendo cadenas de caracteres
		BufferedReader b = new BufferedReader(f); 
		// Sigue leyendo y printando por pantalla hasta que no tenga nada más para leer
		while((cadena = b.readLine())!=null){
			System.out.println(cadena);
		}
		//Cerramos el buffer
		b.close();
	}
	
	//Metodo para ver si se encuentra el codigo en el archivo y si lo encuentra en que linea está.
	public static void buscaCodigo(String archivo, int codigo) throws FileNotFoundException, IOException {
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
	}
	
	public static void main(String [] args) throws IOException {
		buscaCodigo("/Users/USUARIO/Downloads/PROP/DBLP_four_area/author.txt",2245);
		muestraContenido("/Users/USUARIO/Downloads/PROP/DBLP_four_area/author.txt");
	}

}
