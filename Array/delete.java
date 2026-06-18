import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        // Input N
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Kadane's Algorithm logic
        long maxSoFar = arr[0];
        long currentMax = arr[0];

        for (int i = 1; i < n; i++) {
            // Ya to purana sum continue rakho ya naya start karo
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }

        // Final result print karein
        System.out.println(maxSoFar);
        
        sc.close();
    }
}