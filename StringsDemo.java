class StringsDemo{
    public static void main(String args[]){
        String s = "hello";  //99 -> s
        String s2 = new String("hello");   //88 -> s2
        System.out.println(s);
        System.out.println(s2);
        char s3[] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s3[0]);
        // System.out.println(s2[0]); --> error
        char c_array[] = s2.toCharArray();
        System.out.println(c_array[0]);
        System.out.println(s2.toCharArray()[0]);
        System.out.println(s2.charAt(0));

        System.out.println(s2.toCharArray());
        System.out.println(s2.charAt(1));
        // Integer i =Integer.valueOf(10);
        // Integer i2 = new Integer();

        String x = "hello"; // --> creates objects in string pool if the object doesn't exist already  -->77
        String y = "hello";  // --> 77  //literal way of creating strings
        String z = "java";   //  --> 66
        String z2 = "java";   //  --> 66
        String m = new String("hello");  //new keyword syntax
        String n = new String("Ram");  // first java will go to string pool and check if this string exists or not, if it is not existing it will created in sp, but new keyword says that you should create a new object in heap, so java will create an object inside heap also

        //String pool will only have one object at a time of a particular string
        //If we use new keyword syntax, it will go and create a new object inside heap because pool won't allow it

        // 0x123445 == 0x123445
        // x == y -> if both variables are pointing to the same memory or not --> true if yes, otherwise false
        // 10 == 10 -> True
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x == m);
        System.out.println(x.equals(m));

        String new_string = new String("shyam"); //-> will create 2 objects but will point to the heap object

        String another_string = "shyam"; //-> will not create any object, will only point to already existing pool object
        System.out.println("*************************");
        System.out.println(new_string == another_string); //--> false
        System.out.println(new_string.equals(another_string)); // --> true

        String msg = "Welcome user";  //--> msg --> 99
        String msg2 = "Welcome user";
        msg = "Bye user";  //msg --> 88
        
        // msg is going to point to object in pool and the object is immutable by default so we can never make any changes in object where msg is pointing but we can make change in msg and tell it to point to some other object
        //Doing this is necessary so that other refernce variables should not be affected

        System.out.println("*************************");
        String msg3 = msg2.replace('W', 'X')
        System.out.println(msg2.replace('W', 'X'));
        System.out.println(msg2);
    }
}