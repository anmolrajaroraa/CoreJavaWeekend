import java.math.BigInteger;
import java.util.ArrayList;

public class ArrayDemo_Backup {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int a = 10;
		int arr2[] = arr.clone();
		int arr3[] = new int[5];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		arr3[3] = 4;
		arr3[4] = 5;
		arr3[4] = 55;
		arr3[4] = 0;
//		arr3[5] = 6;
		int l = arr.length;
		
		//for-each loop
		
		for(int element : arr) {
			element++;
			System.out.println(element);
		}
		
		System.out.println("**********");
		
		for(int i=0; i<l; i++) {
			System.out.println(arr[i]);
			arr[i]++;
		}
		
		System.out.println("**********");
		
		for(int i=0; i<l; i++) {
			arr[i]++;
			System.out.println(arr[i]);
		}
		
		System.out.println("**********");
		
		for(int i=0; i<l; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println(arr);
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(Integer.valueOf(10));
		al.add('a');
		al.add(true);
		al.add(10.2);
		al.add("Ram");
		al.add(BigInteger.valueOf(1000));
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.get(al.size() - 1));
		
		al.set(5, "new value");
		
		al.add(5, "one more value");
		
		al.remove(Integer.valueOf(12));
		al.remove(10);
		al.remove("Ram");
		al.remove(new Character('a'));
		al.remove(Character.valueOf('a'));
		
		System.out.println(al);
		
		//for-each method (lambda expressions - java 8)
		
		al.forEach(element -> System.out.println(element));
		
		al.forEach(element -> {
			System.out.println(element);
		});
		
		System.out.println(al.contains(10));
		System.out.println(al.subList(2, 5));
		
	}

}
