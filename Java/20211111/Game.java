import java.util.Scanner;
import java.util.Random;

abstract class GameObject{ //�߻� Ŭ����
	protected int distance; // �ѹ� �̵� �Ÿ�
	protected int x,y;// ���� ��ġ(ȭ�� �� ���� ��ġ)
	public GameObject(int startX, int startY, int distance) { // �ʱ� ��ġ�� �̵� �Ÿ��� ����
		this.x = startX;
		this.y = startY;
		this.distance = distance; 
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean collide(GameObject p) { // �� ��ü�� ��ü p�� �浹������ true ����
		if(this.x == p.getX() && this.y == p.getY()) {
			return true; 
			}
	 	return false; 
	}
	
	protected abstract void move();
	protected abstract char getShape();
	
}
class Bear extends GameObject{
	Scanner scanner = new Scanner(System.in);
	public Bear(int x, int y, int distance) {
		super(x,y,distance);
	}
	protected void move() {
		int a =0;
		while(a < 1) {
		System.out.println("������: a  �Ʒ���: s  ����: w  ������: d >> ");
		String move = scanner.next();
		for(int i=0; i<1; i++) {
			if(move.equals("a") && y != 0) {
					y--; a++; break;}
			else if(move.equals("d") && y != 19) {
				y++; a++; break;}
			else if(move.equals("s") && x != 9) {
				x++; a++; break;}
			else if(move.equals("w") && x != 0) {
				x--; a++; break;}
			System.out.println("�����ǿ��� ����ϴ� �ٽ� �Է����ּ���");
			continue;
		}
	}
}
	protected char getShape() {
		return 'B';
	}
}
class Fish extends GameObject{
	Random random = new Random();
	GameObject t;
	int count = 0;
	int distance[] = {-1, +1};
	public Fish(int x, int y, int distance) {
		super(x,y,distance);
	}
	protected void move() {
		this.count++;
		if(count == 4 || count	== 5) {
			int a = random.nextInt(2);
			for(int i=0; i<1; i++) {
				if (a == 1) {
					if(x == 0 || x == 9) {
						continue;}
					x += distance[random.nextInt(2)];
					break;}
				else if (a == 0) {
					if(y == 0 || y == 19) {
						continue;}
					y += distance[random.nextInt(2)];
					break;}
					}
			if(count == 5) {
				count = 0;
		}
	}
}
	protected char getShape() {
		return '@';
	}
}

public class Game {
	Random random = new Random();
	String move;  int x, y, distance;
	GameObject Gameplace[][];
	Bear b = new Bear(0,0,0);
	int z = random.nextInt(9);
	int c = random.nextInt(19);
	Fish f = new Fish(z,c,0);
	
	void show() {
		Gameplace = new GameObject[10][20];	
		for(int i=0; i<Gameplace.length;i++) {
			for(int j=0; j<Gameplace[i].length; j++) {
				if(b.x == i && b.y == j) {
					System.out.print(b.getShape() + " ");
					continue;
				}
				else if(f.x == i && f.y == j) {
					System.out.print(f.getShape() + " ");
					continue;
				}
				System.out.print("- ");
				}
		System.out.println();
		
		}
		f.move();}
	void run() {
		while(true) {
		show();
		b.move();
		if(f.collide(b)) {
			System.out.println("����");
			break;	
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Bear�� Fish �Ա� ������ �����մϴ�.**");
		Game g = new Game();
		g.run();

	}

}
