import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		int valor=0, juros=0, atraso=0, novo=0;
		
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Informe o valor: ");
		 valor=entrada.nextInt();
		 
		 System.out.println("Informe o percentual de juros cobrado: ");
		 juros=entrada.nextInt();
		 
		 System.out.println("Informe o numero de dias em atraso: ");
		 atraso=entrada.nextInt();
		 
		 //NOVO VALOR = VALOR BOLETO + (VALOR BOLETO * (JUROS/100)) * DIAS
		 novo = valor + (valor * (juros/100)) * atraso;
		 System.out.println("O novo valor a ser pago é: R$"+novo);
		 entrada.close();
	}

}

//TA DANDO ERRADOO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!