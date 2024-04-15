

/**
 * @author Ignacio
 * @version 1.0
 * @created 15-Apr-2024 5:16:25 PM
 */
public class Universitario extends Libro {

	private String campoDeEstudio;

	public Universitario(){

	}

	public Universitario(int publicacion, String autor, boolean prestado, String titulo, String campoDeEstudio){
		super(publicacion,autor,prestado,titulo);
		this.campoDeEstudio = campoDeEstudio;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}