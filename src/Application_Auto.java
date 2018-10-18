
public class Application_Auto {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		
		auto.setCarroceria(construirCarroceria());
		auto.setMotor(construirMotor());
		auto.setLlanta(construirLlanta());
		
		System.out.println(auto);
	}

	private static Llanta construirLlanta() {
		Llanta llanta = new Llanta();
		llanta.setMarca("Michelin");
		llanta.setTipo("Radial");
		return llanta;

	}
	
	private static Motor construirMotor() {
		Motor motor=new Motor();
		motor.setModelo("ligero");
		motor.setSerie("AC1235");
		return motor;
		
	}
	
	private static Carroceria construirCarroceria() {
		Carroceria carroceria = new Carroceria();
		carroceria.setModelo("Toyota");
		carroceria.setMarca("curvo");
		return carroceria;
		
	}
}
