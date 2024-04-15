

/**
 * @author Ignacio
 * @version 1.0
 * @created 15-Apr-2024 5:16:25 PM
 */
public class Novela extends Libro {

	private String genero;

	public Novela(){

	}

	public Novela(int publicacion, String autor, boolean prestado, String titulo, String genero){
		super(publicacion,autor,prestado,titulo);
		this.genero = genero;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}