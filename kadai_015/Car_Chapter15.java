package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1; // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	
	
	// ギアの値により速度を変える
	public void changeGear( final int afterGear ) {
		int afterSpeed = 0;
		
		afterSpeed = switch (afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;		
		};
		
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		this.speed = afterSpeed;
		
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "㎞です");
		
	}
}
