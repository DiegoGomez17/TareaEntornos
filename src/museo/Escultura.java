package museo;

public class Escultura extends Pieza {
	//ATRIBUTOS--------------------------------------------
	private String material;
	private String tecnica;
	//CONSTRUCTORES----------------------------------------
	public Escultura(String id, double tama�o, int antiguedad, String material, String tecnica) {
		super(id, tama�o, antiguedad);
		this.material = material;
		this.tecnica = tecnica;
	}
	public Escultura() {
		super();
		this.material = "";
		this.tecnica = "";
	}
	public Escultura(Escultura e) {
		super(e.getId(),e.getTama�o(), e.getAntiguedad());
		this.material = e.material;
		this.tecnica = e.tecnica;
	}
	//-GETTER Y SETTER-----------------------------------------	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	//------------------------------------------------------------
	@Override
	public String toString() {
		return "Escultura [material=" + material + ", tecnica=" + tecnica + "]";
	}
	
	 public void mostrarEscultura()
	 {
		 System.out.println("---------------------------------------------");
		 this.mostrarPieza();
		 System.out.println("Material utilizado en la escultura -> " + this.material);
		 System.out.println("T�cnica de la escultura -> " + this.tecnica);
	 }
	@Override
	public void limpiarPieza() {
		// TODO Auto-generated method stub
		
	}
	

	
}
