package gulosos;

public class TrocoMinimo {
	public static void main(String[] args) {
	
		int[] moedas = {100, 50, 25, 10, 5, 1};
		int valor = 289;
		int i = 0;
		int[] auxiliar = new int[moedas.length];
		
		while(i<moedas.length){
			auxiliar[i] = (int) valor/moedas[i];
			valor = valor - auxiliar[i] * moedas[i];
			i++;
		}
		
		for(int k=0;k<moedas.length;k++){
			System.out.println(auxiliar[k] + " moedas de " + moedas[k]);
		}
	}
}
