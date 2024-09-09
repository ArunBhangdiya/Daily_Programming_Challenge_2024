public class Solution2 {
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        int length = arr.length;
        int med = length / 2;
        float num = 0, num1= 0, num2 = 0;
        if(length%2!=0){
            med = med + 1;
            num = iterate(med, arr);
            System.out.println((int)num);
        }else{
            num1 = iterate(med, arr);
            num2 = med(arr);
            num = (num1 + num2)/2;
            System.out.println(num);
        }
        
    }
    public static int med(int arr[]){
        int i = 0, max = 0;
        while(i < arr.length){
            if(arr[i]>arr[max]){
                max = i;
            }
            i++;
        }
        int temp = arr[max];
        arr[max]=Integer.MIN_VALUE;
        return temp;
    }
    public static float iterate(int med, int arr[]){
        int i = 0;
        float num = 0;
        while(i < med){
            num = med(arr);
            i++;
        }
        return num;
    }
}
