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
	
	public static void main(String [] args) throws IOException {
		muestraContenido("/Users/USUARIO/Downloads/PROP/DBLP_four_area/author.txt");
	}

}
