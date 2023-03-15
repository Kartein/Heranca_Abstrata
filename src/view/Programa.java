package view;

import java.util.List;
import pessoas.Pessoa;
import pessoas.Estudante;
import pessoas.Professor;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
			
				Professor prof1 = new Professor();
				
				Estudante aluno1 = new Estudante();
					
				List<Pessoa> pessoas = new ArrayList<Pessoa>();

				pessoas.add(prof1);
				
				pessoas.add(aluno1);
				
				for(Pessoa p : pessoas) {
					System.out.println(p.toString());
				}
	}
}