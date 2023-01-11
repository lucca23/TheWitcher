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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thewitcher brujo = new thewitcher();
		brujo.setNombre("Juan D");
		brujo.setSalud(100);
		brujo.setTienealma(true);
		
		if (brujo.isDeath()) {
			System.out.println(brujo.getNombre() + " esta muerto.");
		} else {
			System.out.println(brujo.getNombre() + " esta vivo.");
		}
	}

}
