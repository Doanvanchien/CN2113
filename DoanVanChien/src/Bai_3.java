import java.util.Scanner;

public class Bai_3 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String ten;
		int namSinh;
		int namHienTai;
		System.out.println("Nhap vao ho va ten cua ban: ");
		ten = cn.nextLine();
		System.out.println("Nhap vao nam hien tai: ");
		namHienTai = cn.nextInt();
		System.out.println("Nhap vao nam sinh: ");
		namSinh = cn.nextInt();
		if ((namHienTai - namSinh) < 16) {
			System.out.println("Ban " + ten + " o do tuoi vi thanh nien.");
		} else if ((namHienTai - namSinh) >= 16 && (namHienTai - namSinh) < 18) {
			System.out.println("Ban " + ten + " o do tuoi truong thanh.");
		} else if ((namHienTai - namSinh) >= 18) {
			System.out.println("Ban " + ten + " da gia.");
		}
	}
}
