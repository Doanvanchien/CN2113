import java.util.Scanner;

public class testSach {
public static void main(String[] args) {
	Sach s= new Sach();
	s.nhapSach();
	System.out.println("-------");
	s.inSach();
	
	Scanner scn = new Scanner(System.in);
	int n;
	System.out.println("Nhap vao so luong sach muon quan ly thong tin : ");
	n = scn.nextInt();
	Sach sach[] = new Sach[n];
	for(int i=0; i<n ; i++) {
		    System.out.println("Nhap vao thong tin cuon sach thu : "+(i+1));
			sach[i] = new Sach();
			sach[i].nhapSach();
	}
	for(int i=0; i<n ; i++) {
	    System.out.println("Thong tin cuon sach thu : "+(i+1));
		sach[i].inSach();
    }
}
}
