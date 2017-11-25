package classes;

import java.util.ArrayList;

public class Registros {
    
    public Registros(){
    ArrayList<String> nome_materia = new ArrayList();
    nome_materia.add("1;Cálculo 1");
    nome_materia.add("2;Cálculo 2");
    nome_materia.add("2;álgebra Linear");
    nome_materia.add("Admininstração");
    nome_materia.add("Empreendedorismo");
    nome_materia.add("Prog 1");
    nome_materia.add("Prog 2");
    nome_materia.add("Sistemas Digitais");
    nome_materia.add("Computadores e Sociedade");
    nome_materia.add("Engenharia de Software 1");
    nome_materia.add("Engenharia de Software 2");
    nome_materia.add("Engenharia de Software 3");
    nome_materia.add("Projeto e Análise de Algoritmos");
    nome_materia.add("Linguagens de Programação");
    nome_materia.add("Teoria e Prática");
    nome_materia.add("Inteligência Artificial");
    nome_materia.add("Sociologia");
    nome_materia.add("Matemática Discreta");
    nome_materia.add("Computação Simbólica");
    nome_materia.add("Comunicação e Expressão");
    nome_materia.add("Introdução a CC");
    nome_materia.add("Banco de Dados");
    nome_materia.add("Teoria da Computação");
    nome_materia.add("Computação Gráfica");
    nome_materia.add("Compiladores");
    nome_materia.add("Estrutura de Dados");
    nome_materia.add("Metodologia de Pesquisa");
    nome_materia.add("Física");
    nome_materia.add("Arquitetura de Computadores");
    nome_materia.add("Sistemas Operacionais");
    nome_materia.add("Interface Homem-Máquina");
    nome_materia.add("Probabilidade e Estatística");
    nome_materia.add("Redes");
    nome_materia.add("Sistemas Distribuídos");
    nome_materia.add("Prática Ger. Projetos");
    nome_materia.add("Informática e Educação");
    nome_materia.add("Segurança Auditoria");
    
    ArrayList<Materia> listaMateria = new ArrayList<Materia>();
    
    Materia m =  new Materia();
    m.setId(1);
    m.setNome("Calculo 1");
    m.setP("Maisa");
    m.setId_prof(1);
    m.setQntd_aula(4);
    m.setLab(false);
    m.setSemestral(false);
    listaMateria.add(m);
    
    m.setId(2);
    m.setNome("Calculo 2");
    m.setP("Maisa");
    m.setId_prof(1);
    m.setQntd_aula(4);
    m.setLab(false);
    m.setSemestral(false);
    listaMateria.add(m);
    
    m.setId(3);
    m.setNome("Algebra Linear");
    m.setP("Maisa");
    m.setId_prof(1);
    m.setQntd_aula(4);
    m.setLab(false);
    m.setSemestral(true);
    listaMateria.add(m);
    
    m.setId(4);
    m.setNome("Administração");
    m.setP("Carlos");
    m.setId_prof(2);
    m.setQntd_aula(4);
    m.setLab(false);
    m.setSemestral(true);
    listaMateria.add(m);
    
    m.setId(5);
    m.setNome("Emprededorismo");
    m.setP("Carlos");
    m.setId_prof(2);
    m.setQntd_aula(2);
    m.setLab(false);
    m.setSemestral(false);
    listaMateria.add(m);
    
    m.setId(6);
    m.setNome("Programação 1");
    m.setP("Bruno");
    m.setId_prof(3);
    m.setQntd_aula(4);
    m.setLab(true);
    m.setSemestral(false);
    listaMateria.add(m);
    
    m.setId(7);
    m.setNome("Sistemas Digitais");
    m.setP("Mauricio");
    m.setId_prof(4);
    m.setQntd_aula(4);
    m.setLab(true);
    m.setSemestral(false);
    listaMateria.add(m);
    
    m.setId(8);
    m.setNome("Computadores e Sociedades");
    m.setP("Mauricio");
    m.setId_prof(4);
    m.setQntd_aula(4);
    m.setLab(true);
    m.setSemestral(true);
    listaMateria.add(m);
    
    m.setId(9);
    m.setNome("Engenharia de Software 1");
    m.setP("Mauricio");
    m.setId_prof(4);
    m.setQntd_aula(4);
    m.setLab(true);
    m.setSemestral(true);
    listaMateria.add(m);
    
    m.setId(10);
    m.setNome("Projeto e Analise de Algoritmos");
    m.setP("Bruno");
    m.setId_prof(5);
    m.setQntd_aula(2);
    m.setLab(true);
    m.setSemestral(false);
    listaMateria.add(m);
    
    
    }
    
    
}

Maisa -> {
	Cálculo 1 (4 aulas)
	Cálculo 2 (4 aulas)
	Álgebra Linear (4 aulas) semestral
	}

Carlos ->{
	Admininstração (4 aulas)
	Empreendedorismo (2 aulas)
	}

Mauricio ->{
	   Prog 1 (4 aulas)
	   Sistemas Digitais(4 aulas)
	   Computadores e Sociedade (4 aulas) semestral
	   Engenharia de Software I (4 aulas) semestral
	 }

Bruno -> {
	Prog 1 (4 aulas)
	Projeto e Análise de Algoritmos (2 aulas)
	Linguagens de Programação (4 aulas) semestral
	}

Glauco -> { 
	 Teoria e Prática (2 aulas)
	 Inteligência Artificial (4 aulas)
	 }

Cristiane ->{
	   Sociologia (4 aulas) semestral
	  }

Fernando -> {
	      Matemática Discreta (3 aulas)
	      Computação Simbólica (4 aulas) semestral
	    }

CRES -> {
	Comunicação Expressão (4 aulas) semestral
	}

Ailton -> {
	Introdução CC (2 aulas)
	Banco de Dados (4 aulas)
	}

Wellington -> {
	       Teoria da computação (4 aulas)
	       Compiladores (4 aulas)
	       Computação Gráfica (4 aulas) semestral
	      }

Tamara ->{
	Estrutura de Dados (4 aulas)
	Metodologia de Pesquisa (2 aulas) semestral
	}

Merlin -> {
	Programação II (4 aulas)
                }	

Márcio -> {
	Física (3 aulas)
	}

Thiago ->{	
	Arquitetura de Computadores (2 aulas)
	Sistemas Operacionais (4 aulas)
	Interface Homem-Máquina (4 aulas) semestral
	}

Lulu -->	{ 
	 Probabilidade e Estatística (4 aulas) semestral
                  }

Menolli -> {
	Engenharia de Software II (3 aulas)
	}	

Ricardo ->{
	 Redes (4 aulas)
	Sistemas Distribuídos (4 aulas)
	}

Daniela ->{
	Prática Ger. Projetos(4 aulas) semestral
	}

Fábio -> {
	Engenharia III (2 aulas)
	Informática e Educação (4 aulas) semestral
	}

Biluka -> {
	Segurança Auditoria (4 aulas) semestral
	}