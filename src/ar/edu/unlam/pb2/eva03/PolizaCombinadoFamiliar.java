package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales{

	private Set<Persona> listaPersonas; 
	private List<Bien> bienesAsegurados;

	public PolizaCombinadoFamiliar(Integer numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroPoliza, asegurado, sumaAsegurada, prima);
		this.listaPersonas = new HashSet<Persona>();
		this.bienesAsegurados = new ArrayList<Bien>();
	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipo) {
		beneficiario.setTipo(tipo);
		listaPersonas.add(beneficiario);
	}

	@Override
	public void agregarBienAsegurado(Bien bien) {
		this.bienesAsegurados.add(bien);
	}

	public Integer obtenerCantidadDeBeneficiarios() {
		return listaPersonas.size();
	}



	
	
}
