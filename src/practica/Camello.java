package practica;

public class Camello  implements Comparable<Camello>{
	private int nombre;
	private int posicion;


	public Camello()
	{
		nombre = 0;
		posicion = 0;
	}

	public Camello(int n, int pc)
	{
		nombre = n;
		posicion = pc;
	}
	
	public int getNombre()
	{
		return nombre;
	}
	public void setNombre(int n)
	{
		this.nombre = n;
	}
	public int getPosicion()
	{
		return posicion;
	}
	public void setPosicion(int p)
	{
		this.posicion = p;
	}

	@Override
	public int compareTo(Camello o) {
		int compareage=((Camello) o).getPosicion();
		return this.getPosicion()-compareage;
	}

}
