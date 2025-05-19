package main.java.es.cursojava.web.dto;

public class CalculadoraDTO {
    
    private int numero1;
		private int numero2;
		private String operacion;
		private int resultado;
		private String mensaje;
		
		public CalculadoraDTO(int numero1, int numero2, String operacion) {
			this.numero1 = numero1;
			this.numero2 = numero2;
			this.operacion = operacion;
		}
		
		public int getNumero1() {
			return numero1;
		}
		
		public void setNumero1(int numero1) {
			this.numero1 = numero1;
		}
		
		public int getNumero2() {
			return numero2;
		}
		
		public void setNumero2(int numero2) {
			this.numero2 = numero2;
		}
		
		public String getOperacion() {
			return operacion;
		}

		public void setOperacion(String operacion) {
			this.operacion = operacion;
		}

		public int getResultado() {
			return resultado;
		}
		
		public void setResultado(int resultado) {
			this.resultado = resultado;
		}
		
		public String getMensaje() {
			return mensaje;
		}
		
		public void setMensaje(String string) {
			mensaje = string;
		}
}
