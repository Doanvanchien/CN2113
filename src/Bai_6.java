import java.util.Scanner;

public class Bai_6 {
public static void main(String[] args) {
	Scanner cn= new Scanner(System.in);
	int n;
	System.out.println("Nhap vao so nguyen duong n= ");
	n= cn.nextInt();
	int giaithua=1;
	for(int i=1;i<=n;i++) {
	    giaithua*=i;
	}
	System.out.println("Giai thua cua "+n+" ="+giaithua);
}
}
