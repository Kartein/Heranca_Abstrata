package pessoas;

public abstract class Pessoa {

		private String nome;
		private String dataNascimento;
		
		public Pessoa(String nome0, String dataNasc) {
			this.nome = nome0;
			this.dataNascimento = dataNasc;
		}
		public Pessoa() {
			this.nome = "Pedro";
			this.dataNascimento = "07/11/2003";
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		@Override
		public String toString() {
			return String.format("-Pessoa:\nNome: %s \nData de Nascimento: %s\n",this.getNome(), this.getDataNascimento()  , null);
		}
}