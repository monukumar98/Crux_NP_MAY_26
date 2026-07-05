package Lec13;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.length());
		sb.append(1);
		sb.append('a');
		sb.append(false);
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		// System.out.println(sb.delete(1,3));
		// System.out.println(sb.deleteCharAt(1));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.substring(1));
		System.out.println(sb.reverse());
		String s=sb.toString();
	    sb.append(9877);
	    sb.append('p');
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
