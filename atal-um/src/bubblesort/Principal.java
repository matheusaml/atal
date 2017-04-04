package bubblesort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Principal {
	
	public static void main(String[] args) {
		

	    try {
	    	/*
	    	 * É carregado o arquivo sequencia.txt e adicionado em um ArrayList.
	    	 * Cada elemento em uma linha no arquivo.
	    	 * Chama os métodos de ordenação de bubblesort
	    	 */
	        FileReader sequencia = new FileReader("sequencia.txt");
	        BufferedReader leitor = new BufferedReader(sequencia);
	        String s = leitor.readLine();
	        ArrayList<Integer> aList = new ArrayList<Integer>();
	        while(s!=null){
	        	int foo = Integer.parseInt(s);
	        	aList.add(foo);
	        	s = leitor.readLine();
	        }      
	        
	        
	        bs bs = new bs();
	        System.out.println(aList);
	        
	        bs.ordenar(aList);
	        bs.ordenarAoContrario(aList);
	       
	        sequencia.close();
	        
	      } catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: ",
	            e.getMessage());
	      }
	   
	      System.out.println();
		
		
	}

}
