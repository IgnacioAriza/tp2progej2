public class Infantil extends Libro {

	private int edadMinima;

	public Infantil(){

	}

	public Infantil(int publicacion, String autor, boolean prestado, String titulo, int edadMinima){
		super(publicacion,autor,prestado,titulo);
		this.edadMinima = edadMinima;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}