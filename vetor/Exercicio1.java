import java.util.*;
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [20];
		int b[] = new int [20];
		
		
		for(int i=0; i<20; i++) {
			System.out.println("Digite os valores ");
			a[i] = ler.nextInt();
		}
			
			for(int i=0; i<20; i++) {
				if(a[i]%2==0) {
					b[i]=a[i];
					 System.out.print(b[i]);
				}
			}
			
			
			for(int i=0; i<20; i++) {
				if(a[i]%2!=0) {
					b[i]=a[i];
					 System.out.print(b[i]);
				}
			}
	}
}