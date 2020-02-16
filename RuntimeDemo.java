import java.math.BigInteger;

class RuntimeDemo{
    public static void main(String args[]){

        // Runtime runtime = new Runtime();

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total space available : " + runtime.totalMemory() + ", free space : " + runtime.freeMemory() + ", used space  : " + (runtime.totalMemory() - runtime.freeMemory()));

        for(int i = 0; i < 1000000; i++){
            // String s = "ok";
            String s = new String("ok" + i);
        }

        System.out.println("Total space available : " + runtime.totalMemory() + ", free space : " + runtime.freeMemory() + ", used space  : " + (runtime.totalMemory() - runtime.freeMemory()));
    }
}