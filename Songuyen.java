import java.util.Scanner;
public class Songuyen{
public static int tongHaiSo(int a, int b) {
	return a + b;
}
public static float chiaHaiSo(int a, int b) {
	return (float)a/b;
}
public static void main(String[] args){
		int a,b,c;
		float d;
		Scanner songuyen =  new Scanner(System.in);
		a = songuyen.nextInt();
		b = songuyen.nextInt();
		songuyen.close();
		c = tongHaiSo(a,b);
		d = chiaHaiSo(a,b);
		System.out.println("Kq : "+ c + "\t" + d);
	}	
}
