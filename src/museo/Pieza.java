package museo;
/**
 *
 * Esta clase pretende crear un padre que heredara sus atributos a las clases, Cuadro, Escultura y Dinosaurio
 * @author Diego
 *
 */

public abstract class Pieza {

	//ATRIBUTOS--------------------------------------------
		private String id;
		private double tamaño;
		private int antiguedad;
		//CONSTRUCTORES----------------------------------------
		/**
		 * Aqui creamos los constructures que nos ayudaran para la clase prueba
		 * 
		 * Cada parametro son los atributos que utilizara el constructor
		 * @param id. Atributo de la clase
		 * @param tamaño. Atributo de la clase
		 * @param antiguedad. Atributo de la clase
		 */
		public Pieza(String id, double tamaño, int antiguedad) {
			super();
			this.id = id;
			this.tamaño = tamaño;
			this.antiguedad = antiguedad;
		}
		
		/**
		 * Aqui se crea el constructor copia
		 * 
		 * @param p. Este parametro es para mostrar los datos en la clase prueba
		 */
		public Pieza(Pieza p) {
			super();
			this.id = p.id;
			this.tamaño = p.tamaño;
			this.antiguedad = p.antiguedad;
		}
		/**
		 * Aqui creamos el constructor por defecto 
		 */
		public Pieza() {
			super();
			this.id = "";
			this.tamaño = 0.0;
			this.antiguedad = 0;
			//-GETTER Y SETTER-----------------------------------------	
		}
		/**
		 * 
		 * @return En los metodos getter, return devuelve los atributos y los metodos setter los coge
		 */
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public double getTamaño() {
			return tamaño;
		}

		public void setTamaño(double tamaño) {
			this.tamaño = tamaño;
		}

		public int getAntiguedad() {
			return antiguedad;
		}

		public void setAntiguedad(int antiguedad) {
			this.antiguedad = antiguedad;
		}
		//-------------------------------------------------------------

		/**
		 * Creamos el metodo ToString que colocara los datos de pieza
		 */
		@Override
		public String toString() {
			return "Pieza [id=" + id + ", tamaño=" + tamaño + ", antiguedad=" + antiguedad + "]";
		}
		
		/**
		 * Creamos el metodo HashCode y Equals con el atributo ID ya que cada pieza tiene un ID que no se repite
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pieza other = (Pieza) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		//-------------------------------------------------------------
		/**
		 * Creamos el metodo mostrarPieza para que nos lo muestra en la clase prueba
		 */
		public void mostrarPieza()
		 {
			 System.out.println("---------------------------------------------");
			 System.out.println("ID de la pieza -> " + this.id);
			 System.out.println("Tamaño de la pieza -> " + this.tamaño + " centimetros");
			 System.out.println("Antigüedad  de la pieza -> " + this.antiguedad + " años");
		 }
		
		/**
		 * Creamos un metodo abstracto por si en un futuro lo utilizo
		 */
 public abstract void limpiarPieza();
		 
		

}
