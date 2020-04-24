package museo;

import java.util.ArrayList;

public class Sala {
	//ATRIBUTOS--------------------------------------------
	private String idSala;
	private ArrayList<Pieza> piezas;
	//CONSTRUCTORES----------------------------------------
	public Sala(String idSala, ArrayList<Pieza> piezas, ArrayList<String> vibilidad) {
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
	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", piezas=" + piezas + "]";
	}

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
