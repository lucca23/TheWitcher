package Witcher;

public class thewitcher {
	private String nombre;
	private int salud;
	private boolean tienealma;
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getSalud() {
		return salud;
	}



	public void setSalud(int salud) {
		this.salud = salud;
	}



	public boolean isTienealma() {
		return tienealma;
	}



	public void setTienealma(boolean tienealma) {
		this.tienealma = tienealma;
	}

	public boolean isDeath() {
		if(salud==0) {
			return true;
		} else if (!tienealma) {
			return true;
		} else {
			return false;
		}
	}

}
