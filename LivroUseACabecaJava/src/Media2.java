import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,media;
		DecimalFormat df = new DecimalFormat("##0.0");
		
		a = sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		media= ((a*2)+(b*3)+(c*5))/ 10;
		
		System.out.println("MEDIA = " + df.format(media));

	}

}
