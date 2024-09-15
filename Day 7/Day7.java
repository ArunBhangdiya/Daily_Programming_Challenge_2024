import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heigth = new int[n];
        for (int i = 0; i < n; i++) {
            heigth[i] = sc.nextInt();
        }
        int ans = tappedRainWater(heigth, n);
        System.out.println(ans);
        sc.close();
    }
    public static int tappedRainWater(int[] arr, int n){
        int ans=0;
        int left=0, right=n-1;
        int leftMax = arr[left];
        int rightMax = arr[right];
        while (left<right) {
            if (leftMax<rightMax) {
                left++;
                leftMax = Math.max(leftMax,arr[left]);
                ans+=leftMax-arr[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, arr[right]);
                ans+=rightMax-arr[right];
            }
        }
        return ans;
    }
}
