
public class Auto {
	// campos
	private Llanta llanta;
	private Motor motor;
	private Carroceria carroceria;

	public Llanta getLlanta() {
		return llanta;
	}

	public void setLlanta(Llanta llanta) {
		this.llanta = llanta;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria=carroceria;
	}

	@Override
	public String toString() {
		return "Auto [llanta=" + llanta + ", motor=" + motor + ", carroceria=" + carroceria + "]";
	}
	
}
