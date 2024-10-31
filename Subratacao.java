import java.io.EOFException;
import java.util.Scanner;

public class Subratacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v = new Var();
		try (Scanner sc = new Scanner(System.in)) {
			if (true) {
			if (v.X <= 2147483647) {
			System.out.print("X : ");
			v.X = sc.nextInt();
			System.out.println(" ...:::ok:::... ");
			} 
			} 
			if (true) {
			if (v.Y <= 2147483647) {
			System.out.print("Y : ");
			v.Y = sc.nextInt();
			System.out.println(" ...:::ok:::... ");
			}
			}
		}
		if (true) {
			if (v.X < 2147483647 || v.Y < 2147483647 ) {
				if (true) {
				v.S = v.X - v.Y;
				}
				System.out.println();
				System.out.println("Subratacao : " +"(" +v.S+")");
				
			} 
			
				

			

		}
	}

}
