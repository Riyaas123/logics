package logics;

public class challenge4 {
	public static void main(String[] args) {
		int[] numbers={1,2,3,4,5};
		int sum=0;
		for(int i:numbers)
		{
			if(i%2==0)
			{
				sum=sum+i*i;
			}
		}
		System.out.println(sum);
	}
}
