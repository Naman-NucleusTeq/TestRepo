//Find maximum of three numbers using ternary operator
package training;

public class Ternaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10, c = 30, max;
		max = ((a>b)?
				(a>c)?
						a:c
				:(b>c)?
						b:c);
		System.out.println("Max of three numbers = " + max);
	}

}
