import java.util.Scanner;
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to eneter?: ");
        int size = sc.nextInt();

        System.out.println("What is your target? : ");
        int target = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Please enter " + size + "numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println("nums["+ i + "] : ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Quadratic Time Complexity: In computer science, it means the processing time of an algorithm grows proportionally to the square of the input size (n). If you double the number of inputs (2n), the number of operations roughly quadruples (2n)² = 4n²");
        quadraticTimeComplexity(nums, target);
        System.out.println("\n O(n) , also known aslinear time complexity, means an algorithm's execution time or memory usage increases proportionally with the size of the input data (n). If you double the input size, the algorithm takes roughly twice as long to complete");
        linearTimeComplexity(nums, target);


        sc.close();
    }


    static void quadraticTimeComplexity(int[] nums, int target) { // O(n²)
        boolean found = false;
        for (int i=0; i < nums.length; i ++) {
            for (int j=i+1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Match Found");
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    found = true;
//                    break;
                }
            }

//            if (found)
//                break;
        }

        if (!found)
            System.out.println("No solution found");
    }

    static void linearTimeComplexity(int[] nums, int target) { //O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Match Found");
                System.out.println("Indices: [" + map.get(complement) + ", " + i + "]");
//                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("No solution found");
    }

}