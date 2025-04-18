package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private Auto auto;
	private Boolean fueRobado;
	
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

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}
	
	public Boolean getFueRobado() {
		return this.fueRobado;
	}

	
	
}
