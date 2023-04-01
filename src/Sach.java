import java.util.Scanner;

public class Sach {

	private String maSach, tenSach, tenTacGia, loaiSach, nhaXuatBan;
	private int soTrang, soTap, gia;
   
	public void nhapSach() {
		Scanner ns= new Scanner(System.in);
		System.out.println("Nhap ma sach: ");
	    this.maSach= ns.nextLine();
	    
	    System.out.println("Nhap ten sach: ");
	    this.tenSach= ns.nextLine();
	    
	    System.out.println("Nhap ten tac gia: ");
	    this.tenTacGia= ns.nextLine();
	    
	    System.out.println("Nhap loai sach: ");
	    this.loaiSach= ns.nextLine();
	    
	    System.out.println("Nhap nha xuat ban: ");
	    this.nhaXuatBan= ns.nextLine();
	    
	    System.out.println("Nhap so trang: ");
	    this.soTrang= ns.nextInt();
	    
	    System.out.println("Nhap so tap: ");
	    this.soTap= ns.nextInt();
	    
	    System.out.println("Nhap gia: ");
	    this.gia= ns.nextInt();
	    
	}
	
	public void inSach() {
		System.out.println("Ma sach: "+this.maSach);
		System.out.println("Ten sach: "+this.tenSach);
		System.out.println("Ten tac gia: "+this.tenTacGia);
		System.out.println("Loai sach: "+this.loaiSach);
		System.out.println("Nha xuat ban: "+this.nhaXuatBan);
		System.out.println("So trang: "+this.soTrang);
		System.out.println("So tap: "+this.soTap);
		System.out.println("Gia: "+this.gia);
	}
}
