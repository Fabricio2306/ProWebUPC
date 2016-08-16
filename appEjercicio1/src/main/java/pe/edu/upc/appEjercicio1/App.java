package pe.edu.upc.appEjercicio1;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        int numero;
        
        double Numero;
        System.out.println( "Hello World!" );
        
        //Wrapper (Clases Envolventes)==>Casting
        Double Valores =new Double(13);
        
        String[] arrNombres=new String[3];
        for (int i = 0; i < arrNombres.length; i++) {
        	System.out.println("Nombre"+(i+1));
        	arrNombres[i]=s.nextLine();
			
		}
        
    	
    }
}
