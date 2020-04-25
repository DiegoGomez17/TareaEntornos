package museo;
/**
*
* Esta clase pretende crear los atributos unicos de la clase Cuadro mientras que le hereda los atrubutos de Pieza
* @author Diego
*
*/

public class Escultura extends Pieza {
	//ATRIBUTOS--------------------------------------------
	private String material;
	private String tecnica;
	//CONSTRUCTORES----------------------------------------
	/**
	 * 
	 * Aqui creamos los constructures que nos ayudaran para la clase prueba
	 * 
	 * Cada parametro son los atributos que utilizara el constructor, ademas de que hay atributos heredados de Pieza 
	 * @param id. Es un atributo heredado
	 * @param tamaño. Es un atributo heredado
	 * @param antiguedad. Atributo de la clase
	 * @param material. Atributo de la clase
	 * @param tecnica. Atributo de la clase
	 */
	public Escultura(String id, double tamaño, int antiguedad, String material, String tecnica) {
		super(id, tamaño, antiguedad);
		this.material = material;
		this.tecnica = tecnica;
	}
	/**
	 * Aqui creamos el constructor por defecto 
	 */
	public Escultura() {
		super();
		this.material = "";
		this.tecnica = "";
	}
	/**
	 * Aqui se crea el constructor copia
	 * 
	 * @param e. Este parametro es para mostrar los datos en la clase prueba
	 */
	public Escultura(Escultura e) {
		super(e.getId(),e.getTamaño(), e.getAntiguedad());
		this.material = e.material;
		this.tecnica = e.tecnica;
	}
	//-GETTER Y SETTER-----------------------------------------	
	/**
	 * 
	 * @return En los metodos getter, return devuelve los atributos y los metodos setter los coge
	 */
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
	/**
	 * Creamos el metodo ToString que colocara los datos de Escultura
	 */
	@Override
	public String toString() {
		return "Escultura [material=" + material + ", tecnica=" + tecnica + "]";
	}
	
	/**
	 * Creamos el metodo mostrarEscultura para que nos lo muestre en la clase prueba
	 */
	 public void mostrarEscultura()
	 {
		 System.out.println("---------------------------------------------");
		 this.mostrarPieza();
		 System.out.println("Material utilizado en la escultura -> " + this.material);
		 System.out.println("Técnica de la escultura -> " + this.tecnica);
	 }
	 /**
	  * Resultado de crear clase abstracta en el padre, por lo que hereda el metodo LimpiarPieza en el hijo
	  */
	@Override
	public void limpiarPieza() {
		System.out.println("Limpiando escultura");	
		
	}
	
}
