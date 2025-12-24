public class MissingNumberSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number: " + missingNumber);
    }
    
}
