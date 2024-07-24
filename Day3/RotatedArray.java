public class RotatedArray {
    public static void rotate(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        } else if (k > nums.length) {
            k = k % nums.length;
        }
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            arr[j++] = nums[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            if (j < nums.length - 1)
                arr[j++] = nums[i];
            else
                arr[j] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("Rotated Array :");
        rotate(arr,3);
        for(int i:arr){
            System.out.print(i+"  ");
        }
    }
}
