import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
class Principal{
	public static void main (String arg[]){
		ArrayList<Aluno> alunos = new ArrayList<Aluno> ();
		Aluno a = new Aluno();
		a.setNome("Wagner");
		a.setIdade(17);
		alunos.add(a);
		
		Aluno b = new Aluno();
		b.setNome("Agnaldo");
		b.setIdade(19);		
		alunos.add(b);

		Aluno c = new Aluno();
		c.setNome("Gabriel");
		c.setIdade(19);		
		alunos.add(c);

		Aluno d = new Aluno();	
		d.setNome("Luiz");
		d.setIdade(18);
		alunos.add(d);

		Aluno e = new Aluno();
		e.setNome("João");
		e.setIdade(17);			
		alunos.add(e);	
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	

		Collections.sort(alunos);

		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).getNome() + " - " + aluno.get(i).getIdade());
		}	
	}
}