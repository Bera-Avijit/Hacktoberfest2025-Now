import java.util.Scanner;
import java.util.Stack;

public class NextGreaterRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ngr = nextGreaterRight(arr);
        for(int val : ngr){
            System.out.print(val + " ");
        }
    }

    private static int[] nextGreaterRight(int[] arr) {
        int n = arr.length;
        int[] ngr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ngr[i] = -1;
            } else {
                ngr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ngr;
    }
}
