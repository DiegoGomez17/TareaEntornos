package pruebas;

import museo.Cuadro;

/**
 * La funcion de esta clase es probar que funciona los metodos de las clases correspondientes
 * @author Diego
 *
 */
public class PruebaCuadro {

	public static void main(String[] args) {
		Cuadro c1 = new Cuadro("002",20.67,2000,"Tinta china","Madera","Prehistoria");
		Cuadro c2 = new Cuadro("003",20.67,2000,"Tinta china","Madera","Prehistoria");
		c1.mostrarCuadro();
		c2.mostrarCuadro();
	}

}
