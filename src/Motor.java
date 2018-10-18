
public class Motor {
	private String modelo;
	private String serie;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	@Override
	public String toString() {
		return "Motor [modelo=" + modelo + ", serie=" + serie + "]";
	}
	
	
}
