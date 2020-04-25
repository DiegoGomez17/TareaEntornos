package museo;

public abstract class Pieza {

	//ATRIBUTOS--------------------------------------------
		private String id;
		private double tamaño;
		private int antiguedad;
		//CONSTRUCTORES----------------------------------------
		public Pieza(String id, double tamaño, int antiguedad) {
			super();
			this.id = id;
			this.tamaño = tamaño;
			this.antiguedad = antiguedad;
		}
		
		public Pieza(Pieza p) {
			super();
			this.id = p.id;
			this.tamaño = p.tamaño;
			this.antiguedad = p.antiguedad;
		}
		
		public Pieza() {
			super();
			this.id = "";
			this.tamaño = 0.0;
			this.antiguedad = 0;
			//-GETTER Y SETTER-----------------------------------------	
		}

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

		@Override
		public String toString() {
			return "Pieza [id=" + id + ", tamaño=" + tamaño + ", antiguedad=" + antiguedad + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}
		//-------------------------------------------------------------

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
		public void mostrarPieza()
		 {
			 System.out.println("---------------------------------------------");
			 System.out.println("ID de la pieza -> " + this.id);
			 System.out.println("Tamaño la apieza -> " + this.tamaño + " centimetros");
			 System.out.println("Antigüedad  de la pieza -> " + this.antiguedad + " años");
		 }
		
 public abstract void limpiarPieza();
		 
		

}
