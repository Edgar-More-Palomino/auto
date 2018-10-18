
public class Llanta {
	private String tipo;
	private String marca;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Llanta [tipo=" + tipo + ", marca=" + marca + "]";
	}
	
	
}
