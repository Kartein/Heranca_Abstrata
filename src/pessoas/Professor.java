package pessoas;

import pessoas.Pessoa;

public class Professor extends Pessoa {

	private String nome2;
	private String dataNascimento2;
		private int siape;
		private String areaConcurso;

		public Professor(int siape, String areaConcurso, String nome, String dataNascimento) {
			super(nome, dataNascimento);
			this.siape = siape;
			this.areaConcurso = areaConcurso;
		}
		public Professor() {
			this.nome2 = "Paulo";
			this.dataNascimento2 = "24/05/2003";
		}
		public int getSiape() {
			return siape;
		}
		public void setSiape(int siape) {
			this.siape = siape;
		}
		public String getAreaConcurso() {
			return areaConcurso;
		}
		public void setAreaConcurso(String areaConcurso) {
			this.areaConcurso = areaConcurso;
		}
		@Override
		public String toString() {
			return super.toString() + this.getClass().getSimpleName() + ":\nSiape: " + ("182539") + "\nArea do Concurso: " + ("Mecanica Aplicada");
		}
}
