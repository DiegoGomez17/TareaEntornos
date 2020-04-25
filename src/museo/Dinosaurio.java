package museo;
/**
*
* Esta clase pretende crear los atributos unicos de la clase Dinosaurio mientras que le hereda los atrubutos de Pieza
* @author Diego
*
*/

public class Dinosaurio extends Pieza {
	//ATRIBUTOS--------------------------------------------
	private String especie;
	private String periodo;
	//CONSTRUCTORES----------------------------------------
	/**
	 * Aqui creamos los constructures que nos ayudaran para la clase prueba
	 * 
	 * Cada parametro son los atributos que utilizara el constructor, ademas de que hay atributos heredados de Pieza 
	 * @param id. Es un atributo heredado
	 * @param tamaño. Es un atributo heredado
	 * @param antiguedad. Es un atributo heredado
	 * @param especie. Atributo de la clase
	 * @param periodo. Atributo de la clase
	 */
	public Dinosaurio(String id, double tamaño, int antiguedad, String especie, String periodo) {
		super(id, tamaño, antiguedad);
		this.especie = especie;
		this.periodo = periodo;
	}
	/**
	 * Aqui se crea el constructor copia
	 * 
	 * @param d Este parametro es para mostrar los datos en la clase prueba
	 */
	public Dinosaurio(Dinosaurio d) {
		super(d.getId(),d.getTamaño(), d.getAntiguedad());
		this.especie = d.especie;
		this.periodo = d.periodo;

	}
	/**
	 * Aqui creamos el constructor por defecto 
	 */
	public Dinosaurio() {
		super();
		this.especie = "";
		this.periodo = "";
	}
	//-GETTER Y SETTER-----------------------------------------
	/**
	 * 
	 * @return En los metodos getter, return devuelve los atributos y los metodos setter los coge
	 */
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
	/**
	 * Creamos el metodo ToString que colocara los datos de Dinosaurio
	 */
	@Override
	public String toString() {
		return "Dinosaurio [especie=" + especie + ", periodo=" + periodo + "]";
	}
	
	/**
	 * Creamos el metodo mostrarDinosaurio para que nos lo muestre en la clase prueba
	 */
	 public void mostrarDinosaurio()
	 {
		 System.out.println("---------------------------------------------");
		 this.mostrarPieza();
		 System.out.println("Especie de dinosaurio -> " + this.especie);
		 System.out.println("Período-> " + this.periodo);
	 }
	 /**
	  * Resultado de crear clase abstracta en el padre, por lo que hereda el metodo LimpiarPieza en el hijo
	  */
	@Override
	public void limpiarPieza() {
		System.out.println("Limpiando esqueleto de dinosaurio");
		
	}
}
