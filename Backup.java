class Backup{
    public static void main(String args[]){
        // String a = "Ram";
        // R -> Shy
        // Jxvx Progrxmming -> x
        String s = "Java Programming";
        // String s2 = s.clone(); s2.replace("a", "x");
        System.out.println(s.replace("a", "x")); //-> Jxvx Progrxmming
        System.out.println(s); //-> Java Programming 

        String c = new String("Ram").intern(); //-> Heap -> 2 objects -> ambiguous nature -> point ? -> heap

        String a = "Ram"; //-> Pool -> 0 object
        // implicitly intern() fn is called
        
        String b = new String("Ram"); //-> Heap -> 1 object

        // 10 10.2 true "abcd" -> literals -> they can act like values but not variables

        Runtime runtimeObject = Runtime.getRuntime();

        System.out.println(runtimeObject.freeMemory());
        System.out.println(runtimeObject.totalMemory());
        System.out.println(runtimeObject.totalMemory() - runtimeObject.freeMemory());

        for(int i=0; i < 100000; i++){
            String x = new String("ok" + i);
        }

        System.out.println(runtimeObject.freeMemory());
        System.out.println(runtimeObject.totalMemory());
        System.out.println(runtimeObject.totalMemory() - runtimeObject.freeMemory());

        // Hexadecimal code (cafebabe) -> this bytecode has been verified by jre

        String t = "        hello java        ";

        Question 

        Input

        4 -> No. of iterations
        12
        12 can be fitted in :
        byte
        short
        int
        long
        13141551
        13141551 can be fitted in :
        int
        long
        1415252536
        1415252536 can be fitted in :
        int
        long
        24235252525252525
        24235252525252525 can be fitted in :
        long

    }
}