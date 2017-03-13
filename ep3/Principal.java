import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
class Principal{
	public static void main (String arg[]){
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Nota> notas = new ArrayList<Nota>();
		/*
		Disciplina = f = new Disciplina;
		f.setNome("LP2");
		f.setProfessor("Herbert");
		disciplina.add(f);
		Disciplina = g = new Disciplina;
		g.setNome("WEB");
		g.setProfessor("Marcelo");
		disciplina.add(g);
		*/
			
		Nota a = new Nota();
		a.setValor(9.5);
		a.setAluno("Wagner");
		a.setDisciplina("LP2");
		notas.add(a);
		Nota b = new Nota();
		b.setValor(7.5);
		b.setAluno("Wagner");
		b.setDisciplina("Web");
		notas.add(b);
		
		Nota c = new Nota();
		c.setValor(8.5);
		c.setAluno("Matheus");
		c.setDisciplina("LP2");
		notas.add(c);
		Nota d = new Nota();
		d.setValor(6.5);
		d.setAluno("Matheus");
		d.setDisciplina("Web");
		notas.add(d);

		Nota e = new Nota();
		e.setValor(4.5);
		e.setAluno("Elyas");
		e.setDisciplina("LP2");
		notas.add(e);
		Nota f = new Nota();
		f.setValor(6.5);
		f.setAluno("Elyas");
		f.setDisciplina("WEB");
		notas.add(f);
	
		Nota g = new Nota();
		g.setValor(10);
		g.setAluno("Agnaldo");
		g.setDisciplina("LP2");
		notas.add(g);	
		Nota h = new Nota();
		h.setValor(4);
		h.setAluno("Agnaldo");
		h.setDisciplina("WEB");
		notas.add(h);
	
		Nota i = new Nota();
		i.setValor(5);
		i.setAluno("Rodrigo");
		i.setDisciplina("LP2");
		notas.add(i);
		Nota j = new Nota();
		j.setValor(9);
		j.setAluno("Rodrigo");
		j.setDisciplina("WEB");
		notas.add(j);
				
		Collections.sort(notas);
		
		for(int i = 0; i < 5; i++){
			if(i==4){			
			System.out.println("Maior  nota -- > Nome " + notas.get(i).getNome() + " / Nota: " + notas.get(i).getNota());
		}	
		 
	}
}
