import java.util.Scanner;

public class Bai_2 {
public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	int a;
	System.out.println("Nhap a= ");
	a= inp.nextInt();
	if(a%2==0) {
		System.out.println(a+" la so chan");
	}else {
		System.out.println(a+" la so le");
	}
}
}
