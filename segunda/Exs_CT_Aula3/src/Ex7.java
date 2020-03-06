import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		int altura=0, r=0, v=0;
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Informe a altura: ");
		 altura=entrada.nextInt();
		 
		 System.out.println("Informe o raio: ");
		 r=entrada.nextInt();
		 
		 v = (int) 3.14*(r*r)*altura;
		 
		 System.out.println("O volumne é: "+v);
		 entrada.close();
	}

}
