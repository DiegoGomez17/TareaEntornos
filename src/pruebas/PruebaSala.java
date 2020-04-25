package pruebas;


import java.util.ArrayList;

import museo.Cuadro;
import museo.Dinosaurio;
import museo.Escultura;
import museo.Pieza;
import museo.Sala;


public class PruebaSala {
	
	public static void main(String[] args) {
<<<<<<< HEAD
	
=======

		
>>>>>>> Interfaz
		Escultura e1 = new Escultura("002",20.67,2000,"Piedra", "Esculpido");
		Escultura e2 = new Escultura("003",20.67,2000,"Arcilla", "Modelado");
		Dinosaurio d1 = new Dinosaurio("002",20.67,2000,"Tiranosaurus rex", "cretacico");
		Dinosaurio d2 = new Dinosaurio("003",20.67,2000,"velociraptor", "jurasico");
		Cuadro c1 = new Cuadro("002",20.67,2000,"Tinta china","Madera","Prehistoria");
		Cuadro c2 = new Cuadro("003",20.67,2000,"Tinta china","Madera","Prehistoria");
		
		ArrayList<Pieza> piezas = new ArrayList<Pieza>();
		piezas.add(e1);
		piezas.add(e2);
        piezas.add(d1);
        piezas.add(d2);
        piezas.add(c1);
        piezas.add(c2);
        
        Sala s1 = new Sala("001", piezas);
		s1.mostrarSala();
	}

}
