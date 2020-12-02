package practica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {

	static int cantidad = 0;//*1
	static int distancia = 0;//*1
	static ArrayList <Camello>ranking  = new ArrayList<Camello> ();
	public static void main(String[] args) throws IOException  //*1
	{
		/*new CamelloHilo(1).start();
		new CamelloHilo(2).start();
		new CamelloHilo(3).start();*/
		
		Scanner teclado = new Scanner(System.in);//*1
		System.out.println("Cantidad");//*1
		cantidad =  teclado.nextInt();//*1
		System.out.println("Distancia");//*1
		distancia = teclado.nextInt();//*1
		teclado.close();//*1
		//Introduzco la cantidad, para obtener depues el nombre de los camellos
		for(int i = 0; i < cantidad ; i++)//*1
		{
			//Con el i+1 consigo que el primer nombre no sea 0 sino 1
			//new Hilo(i+1, new Camello).start();//*1
			//new Hilo(i+1, new Camello()).start();
			Camello c = new Camello(i+1,0);
			ranking.add(c);
			new Hilo(i+1,c).start();
		}
		

	}
}
