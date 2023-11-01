package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public abstract class Poliza {
	private Integer numeroPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Double premio;
	
	public Poliza(Integer numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super();
		this.numeroPoliza = numeroPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		setPremio();
	}

	public Double getPremio() {
		return this.premio;
	}
	public void setPremio() {
		this.premio = this.prima + (this.prima*0.2);
	}


	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}


	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}


	public Persona getAsegurado() {
		return asegurado;
	}


	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}


	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}


	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}


	public Double getPrima() {
		return prima;
	}


	public void setPrima(Double prima) {
		this.prima = prima;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPoliza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(numeroPoliza, other.numeroPoliza);
	}
	
	
	
}
