package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {

	private List<Persona> personaAseguradas; 
	public PolizaAccidentesPersonales(Integer numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroPoliza, asegurado, sumaAsegurada, prima);
		this.personaAseguradas = new ArrayList<Persona>();
	}
	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		persona.setTipo(tipo);
		this.personaAseguradas.add(persona);
	}
	
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.personaAseguradas.size();
	}

}
