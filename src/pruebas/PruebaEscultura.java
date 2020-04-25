package pruebas;

import museo.Escultura;

/**
 * La funcion de esta clase es probar que funciona los metodos de las clases correspondientes
 * @author Diego
 *
 */
public class PruebaEscultura {

	public static void main(String[] args) {
		Escultura e1 = new Escultura("002",20.67,2000,"Piedra", "Esculpido");
		Escultura e2 = new Escultura("003",20.67,2000,"Arcilla", "Modelado");
		e1.mostrarEscultura();
		e2.mostrarEscultura();


	}

}
