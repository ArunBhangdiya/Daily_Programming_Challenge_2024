import java.util.*;
public class Day9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s1 = new String[n];
        for (int i = 0; i < n; i++) {
            s1[i] = sc.next();
        }
        String ans = longestCommonPrefix(s1,n);
        System.out.println(ans);
        sc.close();
    }
    public static String longestCommonPrefix(String[] arr, int n) {
        if (arr == null || n == 0) {
            return "";
        }
        Arrays.sort(arr);
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}