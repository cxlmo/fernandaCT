import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0, soma=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1� n�mero");
		num1=entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero");
		num2=entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero");
		num3=entrada.nextInt();
		
		soma=num1+num2+num3;
		
		System.out.println("O quadrado da soma dos n�meros �:"+soma*soma);
		
		entrada.close();
	}

}
