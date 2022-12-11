/*
Write a java program that displays the following table. Cast floating-point numbers into
integers.
a
1
2
3
4
5
		b
		2
		3
		4
		5
		6
				pow(a, b)
				1
				8
				81Cast floating-point numbers into
				1024
				15625
 */



public class  Q07{
	public static void main(String[] args) {
		float a=1,b=2;
		System.out.println("a\tb\tpow(a,b)");
		System.out.println((int)a+"\t"+(int)b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+"\t"+(int)b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+"\t"+(int)b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+"\t"+(int)b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+"\t"+(int)b+"\t"+(int)Math.pow(a, b));
	/*
	a = 1;
	b=2;
	System.out.println("a\tb\tpow(a,b)");
	for(int i =1; i<=5; i++) {
		System.out.println((int)a+"\t"+(int)b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		
	}
	*/
	}
		
}

