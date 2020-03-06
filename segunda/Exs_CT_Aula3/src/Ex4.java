import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		double dolar=0, din=0;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite o valor atual do dólar:");
		 dolar=entrada.nextDouble();
		 
		 System.out.println("Digite o valor que você possui:");
		 din=entrada.nextDouble();
		 
		 System.out.println("Você possui:"+(din/dolar)+" doláres");
		 entrada.close();
	}

}
