import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0, soma=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º número");
		num1=entrada.nextInt();
		
		System.out.println("Digite o 2º número");
		num2=entrada.nextInt();
		
		System.out.println("Digite o 3º número");
		num3=entrada.nextInt();
		
		soma=num1+num2+num3;
		
		System.out.println("O quadrado da soma dos números é:"+soma*soma);
		
		entrada.close();
	}

}
