import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
    
        for (int val: a) {
            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int nge[] = new int[arr.length];
        Stack < Integer > stack = new Stack < > ();
        // Arrays.fill(nge, -1); // Fills the array with -1 
        for (int i = 0; i < arr.length; i++) {
            while (stack.size() != 0 && arr[i] > arr[stack.peek()]) {
                nge[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (stack.size() > 0) {
            nge[stack.pop()] = -1;
        }

        return nge;
    }
}
