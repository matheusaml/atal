package gulosos;
import java.util.ArrayList;
import java.util.Scanner;
public class Permutacao {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Digite o número referente a quantidade de elementos da permutação:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
 		for(int i = 1; i < num+1; i++){
 			lista.add(i);
		}
        permutar(lista, lista.size());

    }

    public static void permutar(ArrayList<Integer> lista, int tamanho) {
        if (tamanho == 1) {
            System.out.println(lista);
        } else {
            for (int i = 0; i < tamanho; i++) {
                permutar(lista, tamanho - 1);

                if (tamanho % 2 == 1) {
                    int temp = lista.get(0);
                    lista.set(0, lista.get(tamanho-1));
                    lista.set(tamanho-1, temp);
                    
                } else {
                    int temp2 = lista.get(i);
                    lista.set(i, lista.get(tamanho-1));
                    lista.set(tamanho-1, temp2);
                }
            }
        }
    }
    
}
