import java.math.BigInteger;

strictfp class DataTypes{
    public static void main(String args[]){
        Byte b = 10;   //reference type (object)
        // Byte b = new Byte(10);
        byte c = 10;  //value type
        byte d = (byte)1350000;
        System.out.println(b);
        System.out.println(c);
        System.out.println("D is " + d);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        short s = 32767;
        short s1 = (short)32800;
        System.out.println("s is " + s);
        System.out.println("s1 is " + s1);
        long l = 20000000000L;
        long l1 = 2000;
        int i = (int)20000000000l;

        long phone_no = 8585858585l;  //--> 8 bytes --> 8000 bytes
        String phone_no_2 = "8585858585"; // -->20 bytes  -> 20000 bytes
        // phone_no_2[0];  //error

        //long > int > short > byte //type conversion needed if number is bigger than the range

        //byte -> short -> int -> long  //no type conversion needed whatever the number maybe

        System.out.println("l is " + l);
        System.out.println("i is " + i);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        boolean x = true;
        boolean y = false;

        // by default any number without decimal is considered integer
        // by default numbers with decimal is considered double

        float f = 100000.1234567f;
        System.out.println(f);
        double dd = 10000.123456789123456789;
        System.out.println(dd);
        BigInteger bi = new BigInteger("100000000000000000000000012344");
        BigInteger bi2 = new BigInteger("20000000000000000000000000000");
        // BigInteger bi3 = bi.add(bi2);
        System.out.println(bi.add(bi2));

        128 129 130
        -128 -127 -126 -> 127
        -128 -> 127
    }
}