package question_four;

public class Fibonacci {
    public static void main(String[]ars){
        int pre = 0, sum =0;
        int current = 1;
        while (current <= 4e6){
            if(current % 2 == 0){
                System.out.print(current+" ");
                sum += current;
            }
            int next = current + pre;
            pre = current;
            current = next;
        }
        System.out.println("\nSum is: "+sum);
    }
}
