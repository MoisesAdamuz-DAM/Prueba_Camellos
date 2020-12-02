package practica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class Hilo  extends Thread {
	
	Camello camello;
	int nombre;//*1
    static int posicion;
	//int tir = tirada();//*2
	//int obt = obtenerPosicion();
	boolean finalCarrera = false;
	
	

	public Hilo(int nombre, Camello camello)//*1
	{
		this.nombre = nombre;//*1
		this.camello = camello;
		
	}

	
	
	public void run()//*1
	{
		while(finalCarrera == false)
		{
		//for(int i = 0; i<=5; i++)
			actualizarCarrera();
		}
		
		
	}
	
	
	private int tirada() //*2
	{	
		int resultado = 0;
		Random rm = new Random();
		int lanz = rm.nextInt(10);
		if(lanz >= 9)
		{
			resultado = 3;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(lanz >= 7)
		{
			resultado = 2;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(lanz >= 3)
		{
			resultado = 1;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			resultado = 0;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return resultado;
	}
	
	public int obtenerPosicion(int pos)
	{
		//En la poscion actual le sumo el resultado de la tirada
		int valorActual = camello.getPosicion();
		int nuevoValor = valorActual + pos;
		//Actualizo la posicion de los camellos
	    camello.setPosicion(nuevoValor);
		return nuevoValor;
	}
	public void ordenar()
	{
		
		camello.setNombre(nombre);
		//Camello c = new Camello(camello.getNombre(),camello.getPosicion());
		//Principal.ranking.add(c);
		//Principal.ranking(c);
		Collections.sort(Principal.ranking, new Comparator<Camello>() {
	        @Override
	        public int compare(Camello fruit2, Camello fruit1)
	        {
	        	
	            return  fruit1.getPosicion() - fruit2.getPosicion();
	        }
	    });
		for(int i = 0; i<Principal.ranking.size(); i++) {
			System.out.println((i+1) + " Camello " + Principal.ranking.get(i).getNombre() );
		}

//	for(Camello aux : Principal.ranking)
//	{
//		System.out.println(aux.getNombre()+"->"+aux.getPosicion());
//	}
	}
	public void actualizarCarrera()
	{
		//Introducimos aquí el metodo random, para que se pueda repetir las veces necesarias y así poder seguir sumandole a la posicion
		int tir = tirada();//*2
		 obtenerPosicion(tir);
		 int pos = Principal.distancia - camello.getPosicion();

		 if(pos >0)
			{
			System.out.println("Camello "+ nombre +" avanza " + tir + " posiciones " + " y lleva " + camello.getPosicion()+ " posiciones, y está a  "+pos +" posiciones de llegar a la meta"  );
			}
			else if(pos == 0)
			{
				finalCarrera = true;
			System.out.println("Camello "+ nombre +" avanza " + tir + " posiciones " + " y lleva " + camello.getPosicion()+ " posiciones, y está a  "+pos +" posiciones de llegar a la meta"  );
			
			System.out.println("");
			System.out.println("Ganador de la carrera");
			System.out.println("El ganador de la carrera, es el Camello "+nombre);
			System.out.println("");
			System.out.println("El ranking ha quedado del siguiente modo:");
			ordenar();
			System.exit(1);
			}
	}
	
	

	

}



