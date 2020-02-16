class StringsDemo{
    public static void main(String args[]){
        String s = "hello";  //99 -> s   // 1 or 0 object
        String ss = "hello";
        String s2 = new String("hello");   //88 -> s2  // 1 or 2 objects
        System.out.println(s);
        System.out.println(s2);
        char s3[] = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s3[0]);
        System.out.println("0 element in s2 is");
        // System.out.println(s2[0]); //--> error
        char c_array[] = s2.toCharArray();
        System.out.println(c_array[0]);
        System.out.println(s2.toCharArray()[0]);
        System.out.println(s2.charAt(0));

        System.out.println(s2.toCharArray());
        System.out.println(s2.charAt(1));
        // Integer i =Integer.valueOf(10);
        // Integer i2 = new Integer();

    }
}