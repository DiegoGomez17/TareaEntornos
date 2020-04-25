package museo;

public class Dinosaurio extends Pieza {
	//ATRIBUTOS--------------------------------------------
	private String especie;
	private String periodo;
	//CONSTRUCTORES----------------------------------------
	public Dinosaurio(String id, double tama�o, int antiguedad, String especie, String periodo) {
		super(id, tama�o, antiguedad);
		this.especie = especie;
		this.periodo = periodo;
	}
	public Dinosaurio(Dinosaurio d) {
		super(d.getId(),d.getTama�o(), d.getAntiguedad());
		this.especie = d.especie;
		this.periodo = d.periodo;

	}
	public Dinosaurio() {
		super();
		this.especie = "";
		this.periodo = "";
	}
	//-GETTER Y SETTER-----------------------------------------
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getHabitat() {
		return periodo;
	}
	public void setHabitat(String periodo) {
		this.periodo = periodo;
	}
	//------------------------------------------------------
	@Override
	public String toString() {
		return "Dinosaurio [especie=" + especie + ", periodo=" + periodo + "]";
	}
	
	 public void mostrarDinosaurio()
	 {
		 System.out.println("---------------------------------------------");
		 this.mostrarPieza();
		 System.out.println("Especie de dinosaurio -> " + this.especie);
		 System.out.println("Per�odo-> " + this.periodo);
	 }
	@Override
	public void limpiarPieza() {
		// TODO Auto-generated method stub
		
	}
	

	
	

}
