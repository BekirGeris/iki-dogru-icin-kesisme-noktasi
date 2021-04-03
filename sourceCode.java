package JavaOdevler2;

import java.util.Scanner;

public class KesismeNoktasi {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Birinci dogru icin (x1, y1) ve (x2, y2)"
				+ "noktalarini giriniz...örn;4 5 6 7 enter");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Ikinci dogru icin (x3, y3) ve (x4, y4)"
				+ "noktalarini giriniz...örn;4 5 6 7 enter");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		input.close();
		
		double cevapX1 = (((y1 - y2) * x1 - (x1 - x2) * y1) * (x4 -x3) - (x2 - x1) * ((y3 - y4) * x3 - (x3 - x4) * y3)) / ((y1 - y2) * (x4 - x3) - (x2 - x1) * (y3 - y4));
		double cevapY1 = ((y1 - y2) * ((y3 - y4) * x3 - (x3 - x4) * y3) - ((y1 - y2) * x1 - (x1 - x2) * y1) * (y3 - y4)) / ((y1 - y2) * (x4 - x3) - (x2 - x1) * (y3 - y4));
		
		if(cevapX1 == cevapX1 - 10 || cevapY1 == cevapY1 - 10) {
		
			System.out.println("Kesisim noktasi yok. Dogrular paralel");
			
		}else {
			
			System.out.printf("Kesisim noktasi = (%.3f // %.3f)", cevapX1, cevapY1);		
		
		}	
}
}
