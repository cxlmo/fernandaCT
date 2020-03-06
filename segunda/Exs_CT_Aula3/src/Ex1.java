import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int num=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		num=entrada.nextInt();
		
		System.out.println("O quadrado desse número é: "+num*num);
		
		entrada.close();
	}

}
