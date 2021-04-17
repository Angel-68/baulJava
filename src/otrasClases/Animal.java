package otrasClases;

public class Animal {
	
	private String especie;
	private String nombre;

	public Animal(String especie) {
		super();
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + "]";
	}
	
	

}
