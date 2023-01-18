package Witcher;

public class Main {

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
