package edu.vitor.primeirasemana;
public class BoletimEstudantil{
    // arquivo BoletimEstudantil.java

    //sem identação
    public static void main(String[] args) {
    int mediaFinal = 6;
    if(mediaFinal<6)	
    System.out.println("REPROVADO"); 
    else if(mediaFinal==6)
    System.out.println("PROVA MINERVA"); 
    else
    System.out.println("APROVADO"); 		
    }

    //com identação
    public static void mainIdentado(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
    
}