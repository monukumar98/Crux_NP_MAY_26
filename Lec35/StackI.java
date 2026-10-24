package Lec35;

public interface StackI {
	public static final int x = 90;

	public void push(int x);

	public  int pop();

	public int peek();
	
	static void fun() {
		
	}
	default void fun2() {
		
	}
	// java
	private int  size() {
		return 0;
	}

}
