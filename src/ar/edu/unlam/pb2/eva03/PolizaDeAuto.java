package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private Auto auto;
	public PolizaDeAuto(Integer numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroPoliza, asegurado, sumaAsegurada, prima);
	}

	@Override
	public void agregarBienAsegurado(Bien auto) {
		this.auto = ((Auto)auto);
	}

	public Auto getAuto() {
		return this.auto;
	}

	
	
}
