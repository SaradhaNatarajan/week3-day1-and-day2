package Week3day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop size");
			}
	public static void main(String[] args) {
		Computer obj = new Computer();
		Desktop desk = new Desktop();
		obj.computerModel();
		desk.desktopSize();
	
	
	}

}
