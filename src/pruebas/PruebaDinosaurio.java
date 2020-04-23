package pruebas;

import museo.Dinosaurio;

public class PruebaDinosaurio {

	public static void main(String[] args) {
		Dinosaurio d1 = new Dinosaurio("002",20.67,2000,"Tiranosaurus rex", "cretacico");
		Dinosaurio d2 = new Dinosaurio("003",20.67,2000,"velociraptor", "jurasico");
		d1.mostrarDinosaurio();
		d2.mostrarDinosaurio();

	}

}
