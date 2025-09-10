package lab1;

public class Multiples {

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        return extracted(n, a, b);

    }

    public static int extracted(int n, int a, int b) {
        int num = 0;
        for(int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                num+=1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }
}
