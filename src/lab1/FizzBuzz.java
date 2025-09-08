package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {  // 必须把代码放入class内

    public static void main(String[] args) {  // 也是必须写的，main中的代码才会跑，养成在每个主类中编写 main 方法的习惯

            int i = 1; // ;需要写
            while(i < 100){
                extracted(i);
                i++;
            }

//        for (int i = 1; i < 100; i++) { // 每创建一个新变量的时候，都必须制定其数据类型。并且i++是使用i的值，将i值加1。
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {  // AND现在为&&
//
//                System.out.println("Fizz Buzz");  // 需要print的时候就写这一行，缩写sout
//
//            } else if (divisibleBy3) { // 现在是else if
//
//                System.out.println("Fizz");  // 需要print的时候就写这一行，缩写sout
//
//            } else if (divisibleBy5) {  // 现在是else if
//
//                System.out.println("Buzz");  // 需要print的时候就写这一行，缩写sout
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }  // 标志着for循环的结束
    }  // 标志着main方法的结束

    private static void extracted(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        if(divisibleBy3 && divisibleBy5){
            System.out.println("Fizz Buzz");
        }
        else if(divisibleBy3){
            System.out.println("Fizz");
        }
        else if(divisibleBy5){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
    }

}  // 标志着Fizzbuzz类的结束

