package Lec35;

public class Abstract_Demo_Client {
//	static int x = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstract_Demo2 ab = new Abstract_Demo2();
		ab.fun();
		Abstract_Demo ab1 = new Abstract_Demo() {
			@Override
			public void fun() {
			//	x = x + 5;
			}

			@Override
			public int get() {
				return 0;
			}
		};
		Abstract_Demo ab2 = new  Abstract_Demo() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int get() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	
	}

}
