import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		double dolar=0, din=0;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite o valor atual do d�lar:");
		 dolar=entrada.nextDouble();
		 
		 System.out.println("Digite o valor que voc� possui:");
		 din=entrada.nextDouble();
		 
		 System.out.println("Voc� possui:"+(din/dolar)+" dol�res");
		 entrada.close();
	}

}
