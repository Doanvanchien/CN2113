import java.util.Scanner;

public class Bai_1 {
public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	float a, b;
	System.out.println("Nhap a= ");
	a = inp.nextFloat();
	System.out.println("Nhap b=");
	b = inp.nextFloat();
	System.out.println("----");
	// Tinh tong, hieu, tich, thuong, chia lay du:
	System.out.println("Tong a+b= " + (a + b));
	System.out.println("Hieu= " + (a - b));
	System.out.println("Tich= " + (a * b));
	System.out.println("Thuong= " + (a / b));
	System.out.println("Chia lay du= " + (a % b));

	// So sanh hai so a va b:
	if (a > b) {
		System.out.println("a lon hon b");
	} else if(a<b) {
		System.out.println("a nho hon b");
	}else {
		System.out.println("a bang b");
	}

}}
