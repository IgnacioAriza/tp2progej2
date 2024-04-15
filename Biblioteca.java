public class Biblioteca extends Libro {

	private Libro[] listaLibros;

	Libro[] arrayLibros = new Libro[3];
	int cantidadLibros = 0;

	public Biblioteca(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param libro
	 */
	public void agregarLibro(Libro libro){
		arrayLibros[cantidadLibros] = libro;
		cantidadLibros ++;
	}

	@Override
	public void devolver(Libro libro){
		if(libro.isPrestado()){
			libro.setPrestado(false);
			System.out.println(libro.getTitulo() + " ha sido devuelto.");
		}else{
			System.out.println(libro.getTitulo() + " no esta prestado.");
		}
	}

	public void listarLibros(){
		for (int i = 0; i < arrayLibros.length;i++){
			System.out.println(arrayLibros[i].getTitulo());
			if (arrayLibros[i].isPrestado()){
				System.out.println("Este libro esta siendo prestado.");
			}else {
				System.out.println("Este libro esta disponible");
			}
		}
	}

	@Override
	public void prestar(Libro libro){
		if (libro.isPrestado()){
			System.out.println("El libro ya esta siendo prestado");
		}else{
			libro.setPrestado(true);
			System.out.println(libro.getTitulo() + " ha sido prestado");
		}
	}

}