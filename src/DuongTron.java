import java.util.Scanner;

public class DuongTron extends Diem {
public int r;
public Diem I;
public double C,S;

public DuongTron(int x, int y ) {
	super(x, y);
	I= new Diem(0, 0);
}

public void nhapDT() {
	System.out.println("Nhap toa do tam I: ");
	I.nhapDiem();
	System.out.println("Nhap ban kinh r: ");
	Scanner n = new Scanner(System.in);
	r= n.nextInt();
}
public void inDT() {
	System.out.println("Duong tron tam I: ");
	I.inDiem();
	System.out.println("Ban kinh r= "+r);
	
}
public void tinhCVDT() {
	C=r*2*Math.PI;
	System.out.println("Chu vi duong tron la: "+C);
}
public void tinhDTDT() {
	S= Math.PI*Math.pow(r,2);
	System.out.println("Dien tich duong tron la: "+S);
}
}
