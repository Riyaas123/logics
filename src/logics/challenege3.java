package logics;

public class challenege3 {
public static void main(String[] args) {
	double price=50.0;
	double discount=price>40?price*0.1:price*0.05;
	double finalprice=price-discount;
	System.out.println(finalprice);
}
}