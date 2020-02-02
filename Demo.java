class Demo{
    public final void printSomething(){  //here final says that if class is inherited I will not be overridden
    }
    public static void main(String args[]){
        final int a = 10;
        // a = a + 1;
        // a++;
        String b = "राम ";
        System.out.println(b);
        System.out.println("\u27BD");
    }
}

/*Eclipse code


import java.io.PrintStream;
import java.math.BigInteger;

public class FirstClass{
	public static void main(String[] args) {
		System.out.println("hello world");
		BigInteger i = new BigInteger("100");
		String a = "hello";
		char b[] = ['h','e', 'l', 'l', 'o'];
		a.toUpperCase();
	}
}

class SecondClass extends FirstClass{
	
}
*/