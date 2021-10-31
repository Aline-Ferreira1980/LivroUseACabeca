import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area, raio, n;
		n=3.14159;
		DecimalFormat df = new DecimalFormat("######0.0000");
		
		raio = sc.nextDouble();
		area= n*(Math.pow(raio, 2));
		
		System.out.println("A=" + df.format(area));

	}

}
