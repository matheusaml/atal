package combsort;

import java.util.ArrayList;

public class cs {

	public ArrayList<Integer> ordenar(ArrayList<Integer> al){
		
		double fator = 1.3;
		double tamanho = al.size();
		int gap = (int) (tamanho/fator);
			while (gap>1){
				for(int i=0;(i+gap)<al.size()-1;i++){
					for(int j = 0;(j+gap)<al.size();j++){
							int antes;
							if(al.get(j+gap)<al.get(j)){
								antes = al.get(j+gap);
								al.set(j+gap, al.get(j));
								al.set(j, antes);
							} 
					}
					gap = (int) (gap/1.3);
				}

		}
			System.out.println(al);
			return al;
	}

	
	
	
}
