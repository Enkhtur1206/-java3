
public class RectTest extends MyFrame{
	public void run() {
		//黒
		setColor(0,0,0);
		fillRect(30, 40, 50 ,100);
		//黄
		setColor(2000,2000,0);
		fillRect(130, 40, 50 ,100);
		//青
		setColor(200,100,2550);
		fillRect(30, 200, 150 ,10);
		//紫
		setColor(0,100,255);
		fillRect(90, 160, 30 ,30);
		//灰
		setColor(128,128,128);
		fillRect(90,360,30,10);
	}
}