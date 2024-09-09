// 01/09/2024

// Problem 1: 
// solution:
// code:
class Solution1 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int j=0,k=2;
        int max =0;
        while(j<k){
            max = maxEle(arr);
            j++;
        }
        System.out.println(max);
    }
    public static int maxEle(int arr[]){
        int i=0,max=0;
        while(i < arr.length){
            if(arr[i]>arr[max]){
                max = i;
            }
            i++;
        }
        int temp = arr[max];
        arr[max]=Integer.MIN_VALUE;;
        return temp;
    }
}
// output: 5
