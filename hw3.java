package hw3;
import java.io.*;

public class hw3 {
	public static void main(String args[]) throws IOException{
		//P5
		System.out.println("\nP5");
		CarP5 car5 = new CarP5();
		
		//P6
		System.out.println("\nP6");
		CarP6 car6 = new CarP6();
		
		car6.num = 1234;
		car6.gas = 20.5;
		
		System.out.println("車號是" + car6.num);
		System.out.println("汽油輛是" + car6.gas);
		
		//P7
		System.out.println("\nP7");
		CarP7 car7 = new CarP7();
		
		car7.num = 1234;
		car7.gas = 20.5;
		
		CarP7 car7_1 = new CarP7();
		car7_1.num = 2345;
		car7_1.gas = 30.5;
		
		System.out.println("車號是" + car7.num);
		System.out.println("汽油輛是" + car7.gas);
		System.out.println("車號是" + car7_1.num);
		System.out.println("汽油輛是" + car7_1.gas);
		
		//P9
		System.out.println("\nP9");
		
		Car9 car9 = new Car9();
		car9.num = 1234;
		car9.gas = 20.5;
		
		//P11
		System.out.println("\nP11");
		Car11 car11 = new Car11();
		car11.num = 1234;
		car11.gas = 20.5;
		car11.show();
		car11.show();
		
		//P12
		System.out.println("\nP12");
		Car12 car12 = new Car12();
		car12.num = 1234;
		car12.gas = 20.5;
		car12.showCar();
		
		//P14
		System.out.println("\nP14");
		Car14 car14 = new Car14();
		car14.setNum(1234);
		car14.setGas(20.5);
		
		//P15
		System.out.println("\nP15");
		Car15 car15 = new Car15();
		int number15 = 1234;
		double gas15 = 20.5;
		
		car15.setNumGas(number15, gas15);
		
		//Nothing in P16
		
		//P17
		System.out.println("\nP17");
		Car17 car17 = new Car17();
		car17.setNumGas(1234, 20.5);
		int number17 = car17.getNum();
		double gas17 = car17.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是" + number17 + "，汽油輛是" + gas17);
		
		//P20
		System.out.println("\nP20");
		Car20 car20 = new Car20();
		
		car20.num = 1234;
		car20.gas = -10;
		car20.show();
		
		//P22
		System.out.println("\nP22");
		Car22 car22 = new Car22();
		
		car22.setNumGas(1234, 20.5);
		car22.show();
		
		System.out.println("指定不正確的汽油輛(-10.0)看看");
		car22.setNumGas(1234, -10.0);
		car22.show();
		
		//P24
		System.out.println("\nP24");
		Car24 car24 = new Car24();
		
		car24.setCar(1234, 20.5);
		car24.show();
		
		car24.setCar(2345);
		car24.show();
		
		car24.setCar(30.5);
		car24.show();
		
		//P26
		System.out.println("\nP26");
		Car26 car26 = new Car26();
		car26.show();
		
		//P27
		System.out.println("\nP27");
		Car27 car27_1 = new Car27();
		car27_1.show();
		
		Car27 car27_2 = new Car27(1234, 25.0);
		car27_2.show();
		
		//P28
		System.out.println("\nP28");
		Car28 car28_1 = new Car28();
		car28_1.show();
		
		Car28 car28_2 = new Car28(1234, 25.0);
		car28_2.show();
		
		//P31
		System.out.println("\nP31");
		Car31.showSum();
		
		Car31 car31_1 = new Car31();
		car31_1.setCar(1234, 20.5);
		Car31.showSum();
		
		Car31 car31_2 = new Car31();
		car31_2.setCar(4567, 30.5);
		
		//P34
		System.out.println("\nP34");
		System.out.println("請輸入一個整數");
		
		BufferedReader br34 = new BufferedReader(new InputStreamReader(System.in));
		String str34 = br34.readLine();
		
		int num = Integer.parseInt(str34);
		System.out.println("你輸入的數字是：" + num);
		
		//P36
		System.out.println("\nP36");
		String str36 = "Hello";
		
		char ch136 = str36.charAt(0);
		char ch236 = str36.charAt(1);
		int len36 = str36.length();
		System.out.println(str36 + "的一個字元是" + ch136);
		System.out.println(str36 + "的一個字元是" + ch236);
		System.out.println(str36 + "的長度是" + len36);
		
		//P38
		System.out.println("\nP38");
		System.out.println("請輸入字串");
		BufferedReader br38 = new BufferedReader(new InputStreamReader(System.in));
		String str38_1 = br38.readLine();
		System.out.println("請輸入要檢索的文字");
		String str38_2 = br38.readLine();
		char ch38 = str38_2.charAt(0);
		int num38 = str38_1.indexOf(ch38);
		
		if(num != -1) {
			System.out.println(str38_1 + "的第" + (num38 + 1) + "個字就是「" + ch38 + "」");
		}else {
			System.out.println(str38_1 + "中沒有「" + ch38 + "」這個字");
		}
		
		//P40
		System.out.println("\nP40");
		System.out.println("請輸入字串");
		BufferedReader br40 = new BufferedReader(new InputStreamReader(System.in));
		String str40_1 = br40.readLine();
		System.out.println("請輸入要新增的字串");
		String str40_2 = br40.readLine();
		StringBuffer sb40 = new StringBuffer(str40_1);
		sb40.append(str40_2);
		
		System.out.println("在「" + str40_1 + "」後新增「" + str40_2 + "」的話，就會變成「" + sb40 + "」。");
		
		//P43
		System.out.println("\nP43");
		System.out.println("請輸入兩個整數");
		BufferedReader br43 = new BufferedReader(new InputStreamReader(System.in));
		
		String str43_1 = br43.readLine();
		String str43_2 = br43.readLine();
		
		int num43_1 = Integer.parseInt(str43_1);
		int num43_2 = Integer.parseInt(str43_2);
		
		int ans43 = Math.max(num43_1, num43_2);
		
		System.out.println(num43_1 + "與" + num43_2 + "中較大的是" + ans43);
		
		//P45
		System.out.println("\nP45");
		System.out.println("宣告car1");
		Car45 car45_1 = new Car45();
		car45_1.setCar(1234, 20.5);
		
		System.out.println("宣告car2");
		Car45 car45_2 = new Car45();
		
		System.out.println("將car45_1指定給car45_2");
		car45_2 = car45_1;
		
		System.out.println("car1的");
		car45_1.show();
		
		System.out.println("car2的");
		car45_2.show();
		
		System.out.println("改變car1的相關資料");
		car45_1.setCar(2345, 30.5);
		
		System.out.println("car1的");
		car45_1.show();
		
		System.out.println("car2的");
		car45_2.show();
		
		//P47
		System.out.println("\nP47");
		Car47 car47 = new Car47();
		car47.show();
		int num47 = 1234;
		double gas47 = 20.5;
		String str47 = "1號車";
		
		car47.setCar(num47, gas47);
		car47.setName(str47);
		
		car47.show();
		
		//P51
		System.out.println("\nP51/////");
		Car51[] car51 = new Car51[3];
		
		for(int i = 0; i < car51.length; i++) {
			car51[i] = new Car51();
		}
		
		car51[0].setCar(1234, 20.5);
		car51[1].setCar(2345, 30.5);
		car51[2].setCar(3456, 40.5);
		
		for(int i = 0; i < car51.length; i++) {
			car51[i].show();
		}
	}
}

class CarP5{
	
}

class CarP6{
	int num;
	double gas;
}

class CarP7{
	int num;
	double gas;
}

class Car9{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
}

class Car11{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
}

class Car12{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
	void showCar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
}

class Car14{
	int num;
	double gas;
	
	void setNum(int n) {
		num = n;
		System.out.println("將車號設為" + num);
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為" + gas);
	}
}

class Car15{
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
}

class Car17{
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	
	double getGas() {
		System.out.println("調查汽油輛");
		return gas;
	}
}

class Car20{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
}

class Car22{
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		if(g >=0 && g <= 100) {
			num = n;
			gas = g;
			System.out.println("將車號設為" + num + "，汽油量設為" + gas);
		}else {
			System.out.println(g + "不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
		
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
}

class Car24{
	int num;
	double gas;
	
	public void setCar(int n) {
		num = n;
		System.out.println("將車號設為" + num);
	}
	
	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油輛設為" + gas);
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}

class Car26{
	private int num;
	private double gas;
	
	public Car26() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}

class Car27{
	private int num;
	private double gas;
	
	public Car27() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car27(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}

class Car28{
	private int num;
	private double gas;
	
	public Car28() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car28(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}

class Car31{
	
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car31() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public Car31(int n, double g) {
		num = n;
		gas = g;
		sum++;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public static void showSum() {
		System.out.println("車子共有" + sum + "台");
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}

class Car45{
	private int num;
	private double gas;
	
	public Car45() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car45(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}

class Car47{
	private int num;
	private double gas;
	private String name;
	
	public Car47() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car47(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void setName(String nm) {
		name = nm;
		System.out.println("將車名設為" + name);
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車設為" + num + "，汽油量設為" + gas);
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
}

class Car51{
	private int num;
	private double gas;
	
	public Car51() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油輛是" + this.gas);
	}
	
}







