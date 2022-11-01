
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int weight;
		double height;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen kilonuzu giriniz:");
		weight=input.nextInt();
		
		System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz:");
		height=input.nextDouble();
		
		double vki=weight/(height*height);
		
	
		System.out.println("Vücut kitle indeksiniz:" + vki);
	}

}