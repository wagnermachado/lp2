import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Principal {
	public static void main (String []v) {
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		ArrayList<Nota> nota = new ArrayList<Nota>();
		ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();

		Aluno a = new Aluno();
		a.setAluno("Wagner", 17); 
		aluno.add(a);
		Aluno b = new Aluno();
		b.setAluno("Agnaldo", 19);
		aluno.add(b);
		Aluno c = new Aluno();
		c.setAluno("Maria", 20);
		aluno.add(c);
		Aluno d = new Aluno();
		d.setAluno("Joao", 17);
		aluno.add(d);
		Aluno e = new Aluno();
		e.setAluno("Matheus", 18);
		aluno.add(e);
		
		disciplina1.setDisciplina("LP2", "Herbert Fernandes");
		disciplina.add(disciplina1);
		disciplina2.setDisciplina("WEB", "Marcelo Mussel");
		disciplina.add(disciplina2);

		Nota nota1 = new Nota();
		nota1.setNota(8, a, disciplina1);
		nota.add(nota1);
		Nota nota2 = new Nota();
		nota2.setNota(9, a, disciplina2);
		nota.add(nota2);
		Nota nota3 = new Nota();
		nota3.setNota(9.0, b, disciplina1);
		nota.add(nota3);
		Nota nota4 = new Nota();
		nota4.setNota(2, b, disciplina2);
		nota.add(nota4);
		Nota nota5 = new Nota();
		nota5.setNota(8, c, disciplina1);
		nota.add(nota5);
		Nota nota6 = new Nota();
		nota6.setNota(6, c, disciplina2);
		nota.add(nota6);
		Nota nota7 = new Nota();
		nota7.setNota(5, d, disciplina1);
		nota.add(nota7);
		Nota nota8 = new Nota();
		nota8.setNota(2, d, disciplina2);
		nota.add(nota8);
		Nota nota9 = new Nota();
		nota9.setNota(9.5, e, disciplina1);
		nota.add(nota9);
		Nota nota10 = new Nota();
		nota10.setNota(5.5, e, disciplina2);
		nota.add(nota10);

		for (int i = 0; i < aluno.size(); i++) {
			System.out.println(aluno.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	

		Collections.sort(nota);
		
		System.out.println(nota.get(0).getAluno().getNome()+" " +nota.get(0).getNota()+" "+nota.get(0).getDisciplina().getNome());
		
		int aux=2;
		int i=0;
		while (aux!=0){
			if(nota.get(i).getDisciplina().getNome().compareTo("LP2") == 0){
				System.out.println(nota.get(i).getAluno().getNome()+" "+nota.get(i).getNota());
				aux=0;
			}
			i++;
		}
		
	}
}
