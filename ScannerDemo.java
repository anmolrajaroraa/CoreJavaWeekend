import java.util.Scanner;

class ScannerDemo{
    public static void main(String args[]){
        //Scanner is a buffer which is going to store the data coming from some input source
        Scanner scanner = new Scanner(System.in);

        String nextWord = scanner.next(); // fetch the next word present in the buffer  -    10 hello java -> abcd

        String lineInput = scanner.nextLine(); //-> efgh ijkl

        // scanner.nextInt(); -> 10

        int i = scanner.nextInt(); //- > 20

        int j = scanner.nextInt();

        scanner.nextLine();  //-> \n

        // long l = scanner.nextLong();
        String l = scanner.nextLine();

        System.out.println("next word is" + nextWord + 10);
        System.out.println("next line is" + lineInput + 10);
        System.out.println("next int is" + (i + 10));
        System.out.println("i + j is" + (i + j));

    }
}


// \n
// 12131414


// next() -> abcd
// nextLine() ->  efgh\n
// nextInt() -> 10
// nextINt() ->  20
// nextLine() -> \n