package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza> polizas;
	
	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizas = new HashSet<Poliza>();
	}

	public void agregarPoliza(Poliza poliza) {
		this.polizas.add(poliza);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return this.polizas.size();
	}

	public void denunciarSiniestro(Integer nroPoliza) throws PolizaInexistente {
		Poliza poliza = buscarPolizaPorNumero(nroPoliza);
		if(poliza instanceof PolizaDeAuto)
			((PolizaDeAuto)poliza).setFueRobado(true);
		
		if(poliza instanceof PolizaAccidentesPersonales)
			((PolizaAccidentesPersonales)poliza).setTuvoAccidente(true);
				
	}
	public Poliza buscarPolizaPorNumero(Integer nroPoliza) throws PolizaInexistente {
		for(Poliza pol : polizas) {
			if(pol.getNumeroPoliza() == nroPoliza)
				return pol;
		}
		
		throw new PolizaInexistente("La poliza no existe");
	}

	public Poliza getPoliza(Integer nroPoliza) throws PolizaInexistente {
		return buscarPolizaPorNumero(nroPoliza);
	}

	
}
