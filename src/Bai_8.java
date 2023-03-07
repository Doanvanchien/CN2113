import java.util.Scanner;

public class Bai_8 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap so luong so nguyen(n>0): ");
			n = cn.nextInt();
		} while (n <= 0);
		int a[];
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + i + ": ");
			a[i] = cn.nextInt();
		}
		System.out.println("-----");
		System.out.println("Day so nguyen da nhap la: ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		int tbc=0;
		for(int i=0;i<n;i++) {
			tbc+=a[i];
		} 
		System.out.println("Trung binh cong cua day so nguyen da nhap la: "+(float)tbc/n);
	}
}
