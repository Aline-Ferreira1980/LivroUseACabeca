import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
		int numero, qtdHora;
		double valorHora, salary;
		
		numero=  sc.nextInt();
		qtdHora = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salary = qtdHora * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + df.format(salary));

		sc.close();
	}

}
