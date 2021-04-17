package otrasClases;

public class Persona {
	
	private String nombre;
	
	public Persona(String name) {
		nombre=name;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "mi nombre es "+nombre;
	}

}
