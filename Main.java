
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int kilo;
		double boy;
		
		Scanner girdi=new Scanner(System.in);
		System.out.print("Lütfen kilonuzu giriniz:");
		kilo=girdi.nextInt();
		
		System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz:");
		boy=girdi.nextDouble();
		
		double vki=kilo/(boy*boy);
		
	
		System.out.println("Vücut kitle indeksiniz:" + vki);
	}

}