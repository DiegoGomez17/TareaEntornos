package museo;


public class Cuadro extends Pieza {
	//ATRIBUTOS--------------------------------------------
	private String tecnica;
	private String soporte;
	private String tematica;
	//CONSTRUCTORES----------------------------------------
	public Cuadro(String id, double tamaño, int antiguedad, String tecnica, String soporte, String tematica) {
		super(id, tamaño, antiguedad);
		this.tecnica = tecnica;
		this.soporte = soporte;
		this.tematica = tematica;
	}
	public Cuadro(Cuadro c) {
		super(c.getId(),c.getTamaño(), c.getAntiguedad());
		this.tecnica = c.tecnica;
		this.soporte = c.soporte;
		this.tematica = c.tematica;
	}
	public Cuadro() {
		super();
		this.tecnica = "";
		this.soporte = "";
		this.tematica = "";
	}
	//-GETTER Y SETTER-----------------------------------------
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public String getSoporte() {
		return soporte;
	}
	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	//-------------------------------------------------------------
	@Override
	public String toString() {
		return "Cuadro [tecnica=" + tecnica + ", soporte=" + soporte + ", tematica=" + tematica + "]";
	}
	
	 public void mostrarCuadro()
	 {
		 System.out.println("---------------------------------------------");
		 this.mostrarPieza();
		 System.out.println("Técnica utilizada en el cuadro -> " + this.tecnica);
		 System.out.println("Soporte del cuadro -> " + this.soporte);
		 System.out.println("Temática del cuadro -> " + this.tematica);
	 }
	@Override
	public void limpiarPieza() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}

