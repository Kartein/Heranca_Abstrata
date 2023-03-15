package pessoas;

import pessoas.Pessoa;

public class Estudante extends Pessoa{

		private String nome1;
		private String dataNascimento1;
		private int ra;
		private String curso;

		public Estudante(int ra, String curso, String nome, String dataNascimento) {
			super(nome, dataNascimento);
			this.ra = ra;
			this.curso = curso;
		}
		public Estudante() {
			this.nome1 = "Paula";
			this.dataNascimento1 = "09/04/2003";
		}
		public int getRa() {
			return ra;
		}
		public void setRa(int ra) {
			this.ra = ra;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		@Override
		public String toString() {
			return super.toString() + this.getClass().getSimpleName() + ":\nResgistro do Aluno: " + ("043981") + "\nCurso: " + "Mecatronica";
		}
}