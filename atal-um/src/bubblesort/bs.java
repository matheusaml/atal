package bubblesort;

import java.util.ArrayList;

public class bs {

/**
 *  Método que ordena pelo método BubbleSort um ArrayList de inteiros
 * @param al Lista a ordenar
 * @return Lista de inteiros ordenada
 */

	public ArrayList<Integer> ordenar (ArrayList<Integer> al){
		long tempoInicial = System.currentTimeMillis();
		int vzs = 0;
		for(int i = 0; i < al.size()-1; i++){
			for(int j = 0; j < al.size()-1; j++){
				//System.out.println("\nA bolha é : " + al.get(j));
				if(al.get(j)>al.get(j+1)){ //Se o elemento da posição j for maior que o seu próximo
					int aux = al.get(j); //Guarda, temporariamente o valor que está no indice j na variavel auxiliar
					al.set(j, al.get(j+1)); //Seta na posição j o valor do próximo elemento
					al.set(j+1, aux); // Seta na posição do próximo elemento o valor da variável aux
					//System.out.println(al);
				} vzs++;
			}
			
		} System.out.println("\n" + al);
		System.out.println(vzs + " laços");
		long tempoFinal = System.currentTimeMillis();
		System.out.println( tempoFinal - tempoInicial  + " milissegundo(s)");
		return al;
	}
	/*
	 * BubbleSort "melhorados".
	 */
	public ArrayList<Integer> ordenarAoContrario (ArrayList<Integer> al){
		int vzs = 0;
		for(int i = 0;i<=al.size()-1;i++){
			for(int j = al.size()-1;j>0;j--){ // Foram pegos os dois ultimos numeros
				if(al.get(j) < al.get(j-1)){ // Verifica se o último elemento é menor que o anterior ao mesmo
					int aux = al.get(j); // Seta, na variavel auxiliar, o último elemento
					al.set(j, al.get(j-1)); // Seta no lugar do último lugar o valor do elemento anterior
					al.set(j-1, aux); // Seta no lugar do anterior o valor da varivavel auxiliar
				}vzs++; // Só para contar quantos laços faz
			} 

		}  System.out.println(al);
		System.out.println(vzs + " laços");
		return al;
	}


}
