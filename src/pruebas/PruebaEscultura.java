package pruebas;

import museo.Escultura;

public class PruebaEscultura {

	public static void main(String[] args) {
		Escultura e1 = new Escultura("002",20.67,2000,"Piedra", "Esculpido");
		Escultura e2 = new Escultura("003",20.67,2000,"Arcilla", "Modelado");
		e1.mostrarEscultura();
		e2.mostrarEscultura();


	}

}
