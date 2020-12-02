package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayLista{

	public static void main(String[] args) {
		//creamos eRankingl ArrayList que contendrá la altura de los alumnos
		ArrayList<Camello> ranking = new ArrayList<Camello>();

		Camello c1 = new Camello(1,2);
		Camello c2 = new Camello(2,4);
		Camello c3 = new Camello(3,1);

		ranking.add(c1);
		ranking.add(c2);
		ranking.add(c3);
		
//		for(Camello aux : ranking)
//		{
//			System.out.println(aux.getNombre()+"->"+aux.getPosicion());
//		}
		
		// Sorting
		Collections.sort(ranking, new Comparator<Camello>() {
		        @Override
		        public int compare(Camello fruit2, Camello fruit1)
		        {
		        	

		            return  fruit1.getPosicion() - fruit2.getPosicion();
		        }
		    });

		for(Camello aux : ranking)
		{
			System.out.println(aux.getNombre()+"->"+aux.getPosicion());
		}
		
	}
}
