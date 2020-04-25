package museo;
import java.util.ArrayList;
/**
 * Esta clase pretende crear el lugar donde se alojara el arraylist de pieza y el ID de la Sala
 * @author Diego
 *
 */

public class Sala {
	//ATRIBUTOS--------------------------------------------
	private String idSala;
	private ArrayList<Pieza> piezas;
	//CONSTRUCTORES----------------------------------------
<<<<<<< HEAD
=======
	/**
	 * El metodo de este constructor, lo arreglamos un poco para evitar que nos salte el error de Java null pointer
	 * @param idSala. Atributo de la clase
	 * @param piezas. Es un arrayList de Pieza
	 */
>>>>>>> master
	public Sala(String idSala, ArrayList<Pieza> piezas) {
		this.idSala = idSala;
		if(piezas == null)
		{
			this.piezas = new ArrayList<Pieza>();
		}
		else
		{
			this.piezas = piezas;
		}
		//-GETTER Y SETTER-----------------------------------------	
	}
	/**
	 * 
	 * @return En los metodos getter, return devuelve los atributos y los metodos setter los coge
	 */
	public String getIdSala() {
		return idSala;
	}
	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}
	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}
	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}
	//------------------------------------------------------------
	/**
	 * Creamos el metodo ToString que colocara los datos de Sala
	 */
	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", piezas=" + piezas + "]";
	}
	
	/**
	 * Creamos el metodo mostrarSala para que nos lo muestre en la clase prueba, ademas de que utilizo For each para que muestre correctamente el array
	 */
	 public void mostrarSala()
	 {
		 System.out.println("---------------------------------------------");
		 System.out.println("ID de sala -> " + this.idSala);
		 for(Pieza p: this.piezas)
			{
				p.mostrarPieza();
			}
			System.out.println("------------------------\n\n");
	 }
	

}
