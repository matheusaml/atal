package combsort;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(233324);
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(24);
		al.add(99);
		al.add(591);
		al.add(7);
		al.add(1029388);
		al.add(3);
		al.add(8);
		
		cs cs = new cs();
		cs.ordenar(al);
		
	}
	

}
