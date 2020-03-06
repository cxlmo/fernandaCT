import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0, num4=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º número");
		num1=entrada.nextInt();
		
		System.out.println("Digite o 2º número");
		num2=entrada.nextInt();
		
		System.out.println("Digite o 3º número");
		num3=entrada.nextInt();
		
		System.out.println("Digite o 4º número");
		num4=entrada.nextInt();
		
		System.out.println("O resultado da multiplicação do 1º pelo 3º é:"+num1*num3);
		
		System.out.println("O resultado da soma do 2º pelo 4º é:"+(num2+num4));
		entrada.close();
	}

}
