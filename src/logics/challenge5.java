package logics;

public class challenge5 {
public static void main(String[] args) {
	int n=5;
	String result="";
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			result=result+(i+1);
		}
		else
		{
			result=result+(i-1);
		}
	}
	System.out.println(result);
}
}
