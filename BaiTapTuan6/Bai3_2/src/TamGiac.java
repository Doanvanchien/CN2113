
public class TamGiac extends Diem {
	private Diem A, B, C;
    public double AB,BC, AC, P,S,p;
	public TamGiac(int x, int y) {
		super(x, y);
		A = new Diem(0, 0);
		B = new Diem(0, 0);
		C = new Diem(0, 0);
	}

	public void nhapTG() {

		System.out.println("Nhap toa do dinh A:");
		A.nhapDiem();
		System.out.println("Nhap toa do dinh B:");
		B.nhapDiem();
		System.out.println("Nhap toa do dinh C:");
		C.nhapDiem();
	}

	public void inTG() {
		System.out.println("Dinh A: ");
		A.inDiem();
		System.out.println("Dinh B: ");
		B.inDiem();
		System.out.println("Dinh C: ");
		C.inDiem();
	}
        
	public void kiemTra() {
       AB= Math.sqrt(Math.pow(B.x-A.x, 2)+Math.pow(B.y-A.y, 2));
       AC= Math.sqrt(Math.pow(C.x-A.x, 2)+Math.pow(C.y-A.y, 2));
       BC= Math.sqrt(Math.pow(C.x-B.x, 2)+Math.pow(C.y-B.y, 2));
       
       if(AB+AC>BC&&AB+BC>AC&&AC+BC>AB) {
    	   System.out.println("3 dinh tren tao thanh tam giac");
       }else {
    	   System.out.println("3 dinh tren khong tao thanh tam giac");
       }
	}
	
	public void tinhCV() {
		
		P= AB+BC+AC;
		System.out.println("Chu vi cua tam giac la: "+P);
	}
	
	public void tinhDT() {
		p=P/2;
		S=Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
		System.out.println("Dien tich cua tam giac la: "+S);
	}
}
