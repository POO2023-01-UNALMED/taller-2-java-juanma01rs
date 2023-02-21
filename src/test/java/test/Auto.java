package test;

public class Auto {

		String modelo;
		int precio;
		Asiento[] asientos;
		String marca;
		Motor motor;
		int registro;
		static int cantidadCreados;
		
		int cantidadAsientos() {
			int cantidad = 0;
			for (int i = 0; i < asientos.length; i++) {
				if (asientos[i] instanceof Asiento) {
					cantidad++;
				}
			}
			return cantidad;
		}
		
		String verificarIntegridad() {
			if (this.motor.registro == this.registro) {
				for (int i = 0; i < this.asientos.length; i++) {
					if (this.asientos[i] != null) {
						if (this.asientos[i].registro != this.registro) {
							return "Las piezas no son originales";
					    }	
					}
				}
			}	
			else {
				return "Auto original";
			}	
		}
}		