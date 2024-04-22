package logics;

public class challenge7 {
public static void main(String[] args) {
	String str="java";
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	reverse=reverse+str.substring(0,1);
	System.out.println(reverse);
}
}