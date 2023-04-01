import java.util.Scanner;

public class Diem {
	 int x, y;
	
	
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void nhapDiem() {
		Scanner nd = new Scanner(System.in);
		System.out.println("x= ");
		x= nd.nextInt() ;
		System.out.println("y= ");
		y= nd.nextInt() ;
	}

	public void inDiem() {
		System.out.println("(" + x + "," + y + ")");
	}
}
