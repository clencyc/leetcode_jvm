import java.util.Scanner;
import java.lang.Math.*;

class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first linked list:");
        int l1size = sc.nextInt();
        int[] l1 = new int[l1size];
        for (int i=0; i< l1size; i++) {
            System.out.println("l1[" + i + "]");
            l1[(l1size-i) - 1] = sc.nextInt();
        }


        System.out.println("Enter the size of the second linked list:");
        int l2size = sc.nextInt();
        int[] l2 = new int[l2size];
        for (int i=0; i< l2size; i++) {
            System.out.println("l2[" + i + "]");
            l2[(l2size-i) - 1] = sc.nextInt();
        }

        soln1(l1, l2);

    }

    static  void soln1 (int[] l1, int[] l2) {

        //find larger
        int measure = Math.max(l1.length, l2.length);
        int[] sums = new int[measure];
        int carry = 0;

        for (int i = 0; i < measure; i++) {
            int num1 = (i < l1.length) ? l1[i] : 0;
            int num2 = (i < l2.length) ? l2[i] : 0;

            int total = num1 + num2 + carry;
            int digit = total % 10;
            carry = total /10;
            System.out.println("digit for sum of ["+num1+","+num2+"] is "+ digit +" for index "+ i + " carry "+ carry);
        }

        if (carry > 0) {
            System.out.println("Digit: " + carry);
        }
    }
}