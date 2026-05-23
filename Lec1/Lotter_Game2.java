package Lec1;

public class Lotter_Game2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 105;
		if (num >= 100 && num <= 350) {
			System.out.println("Bike");
			if (num <= 189) {
				System.out.println("KTM");
			} else {
				System.out.println("Hero");
			}

		} else if (num >= 450 && num <= 585) {
			System.out.println("Mac");
			if (num <= 539) {
				System.out.println("M2");
			} else {
				System.out.println("M4");
			}

		} else if (num >= 51 && num <= 99) {
			System.out.println("Cycle");
			if (num <= 71) {
				System.out.println("ATLAS");
			} else {
				System.out.println("AVON");
			}

		} else if (num >= 642 && num <= 755) {
			System.out.println("car");
			if (num <= 699) {
				System.out.println("ThAR");
			} else {
				System.out.println("Creta");
			}

		} else {
			System.out.println("Happy BirthDay!!");

		}

	}
}
