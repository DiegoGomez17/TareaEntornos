package pruebas;

import java.util.ArrayList;

import museo.Cuadro;
import museo.Dinosaurio;
import museo.Pieza;

public class PruebaPieza {

		public static void main(String[] args) {
			ArrayList<Pieza> pz= new ArrayList<Pieza>();
			Dinosaurio d1 = new Dinosaurio("002",20.67,2000,"Tiranosaurus rex", "cretacico");
			Cuadro c1 = new Cuadro("002",20.67,2000,"Tinta china","Madera","Prehistoria");
			
			pz.add(d1);
			pz.add(c1);
			
			for(int i=0;i<pz.size();i++)
			{
				System.out.println(pz.get(i).toString()	);
			}
		}
}


