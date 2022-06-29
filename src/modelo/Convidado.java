/**
 * SI - POO - Prof. Fausto Ayres
 *
 */
package modelo;

public class Convidado extends Participante {
	private String empresa;

	public Convidado(String email, String nome, int idade, String empresa) {
		super(email, nome, idade);
		this.empresa = empresa;
	}

	public int getPercentual() {
		return super.getPercentual() + 50;
	}
	
	@Override
	public String toString() {
		String texto =  "email=" + email + ", nome=" + nome + ", idade=" + idade + ", percentual="+getPercentual() +", empresa=" + empresa ;
		texto += ", eventos:";
		for(Evento e : getEventos())
			texto += e.getId() + ",";
		return texto;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
		
	

}
