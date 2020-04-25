package museo;

public abstract class Pieza {

	//ATRIBUTOS--------------------------------------------
		private String id;
		private double tama�o;
		private int antiguedad;
		//CONSTRUCTORES----------------------------------------
		public Pieza(String id, double tama�o, int antiguedad) {
			super();
			this.id = id;
			this.tama�o = tama�o;
			this.antiguedad = antiguedad;
		}
		
		public Pieza(Pieza p) {
			super();
			this.id = p.id;
			this.tama�o = p.tama�o;
			this.antiguedad = p.antiguedad;
		}
		
		public Pieza() {
			super();
			this.id = "";
			this.tama�o = 0.0;
			this.antiguedad = 0;
			//-GETTER Y SETTER-----------------------------------------	
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public double getTama�o() {
			return tama�o;
		}

		public void setTama�o(double tama�o) {
			this.tama�o = tama�o;
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
			return "Pieza [id=" + id + ", tama�o=" + tama�o + ", antiguedad=" + antiguedad + "]";
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
			 System.out.println("Tama�o la apieza -> " + this.tama�o + " centimetros");
			 System.out.println("Antig�edad  de la pieza -> " + this.antiguedad + " a�os");
		 }
		
 public abstract void limpiarPieza();
		 
		

}
