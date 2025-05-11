package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	int per = 0;

	public void gearChange(int afterGear) {
		this.gear = afterGear;
		System.out.println("ギア1から" + afterGear + "に切り替えました。");
	}

	public void run() {
		switch(gear) {
		case 1:
			per = this.speed;
			break;

		case 2:
			per = 20;
			break;

		case 3:
			per = 30;
			break;

		case 4:
			per = 40;
			break;

		case 5:
			per = 50;
			break;

		default:
			per = this.speed;
		}

		System.out.println("速度は時速" + per + "kmです。");
	}
}