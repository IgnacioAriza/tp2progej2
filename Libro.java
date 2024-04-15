public class Libro implements Prestable {

	private int publicacion;
	private String autor;
	private boolean prestado;
	private String titulo;

	public Libro(){

	}

	public Libro(int publicacion, String autor, boolean prestado, String titulo){
		this.publicacion = publicacion;
		this.autor = autor;
		this.prestado = prestado;
		this.titulo = titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void finalize() throws Throwable {

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