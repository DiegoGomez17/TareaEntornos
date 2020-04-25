package museo;
/**
*
* Esta clase pretende crear los atributos unicos de la clase Cuadro mientras que le hereda los atrubutos de Pieza
* @author Diego
*
*/

public class Cuadro extends Pieza {
	//ATRIBUTOS--------------------------------------------
	private String tecnica;
	private String soporte;
	private String tematica;
	//CONSTRUCTORES----------------------------------------
	/**
	 * Aqui creamos los constructures que nos ayudaran para la clase prueba
	 * 
	 * Cada parametro son los atributos que utilizara el constructor, ademas de que hay atributos heredados de Pieza  
	 * @param id. Es un atributo heredado
	 * @param tamaño. Es un atributo heredado
	 * @param antiguedad. Es un atributo heredado
	 * @param tecnica. Atributo de la clase
	 * @param soporte. Atributo de la clase
	 * @param tematica. Atributo de la clase
	 */
	public Cuadro(String id, double tamaño, int antiguedad, String tecnica, String soporte, String tematica) {
		super(id, tamaño, antiguedad);
		this.tecnica = tecnica;
		this.soporte = soporte;
		this.tematica = tematica;
	}
	/**
	 * Aqui se crea el constructor copia
	 * 
	 * @param c. Este parametro es para mostrar los datos en la clase prueba
	 */
	public Cuadro(Cuadro c) {
		super(c.getId(),c.getTamaño(), c.getAntiguedad());
		this.tecnica = c.tecnica;
		this.soporte = c.soporte;
		this.tematica = c.tematica;
	}
	/**
	 * Aqui creamos el constructor por defecto 
	 */
	public Cuadro() {
		super();
		this.tecnica = "";
		this.soporte = "";
		this.tematica = "";
	}
	/**
	 * 
	 * @return En los metodos getter, return devuelve los atributos y los metodos setter los coge
	 */
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
	/**
	 * Creamos el metodo ToString que colocara los datos de Cuadro
	 */
	@Override
	public String toString() {
		return "Cuadro [tecnica=" + tecnica + ", soporte=" + soporte + ", tematica=" + tematica + "]";
	}
	/**
	 * Creamos el metodo mostrarCuadro para que nos lo muestre en la clase prueba
	 */
	 public void mostrarCuadro()
	 {
		 System.out.println("---------------------------------------------");
		 this.mostrarPieza();
		 System.out.println("Técnica utilizada en el cuadro -> " + this.tecnica);
		 System.out.println("Soporte del cuadro -> " + this.soporte);
		 System.out.println("Temática del cuadro -> " + this.tematica);
	 }
	 /**
	  * Resultado de crear clase abstracta en el padre, por lo que hereda el metodo LimpiarPieza en el hijo
	  */
	@Override
	public void limpiarPieza() {
		System.out.println("Limpiando cuadro");	
		
	}

}

