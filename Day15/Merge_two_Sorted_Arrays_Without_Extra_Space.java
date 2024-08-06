import java.util.Arrays;

public class Merge_two_Sorted_Arrays_Without_Extra_Space {
    public static int[] BruteeFroceApproach(int[] nums1, int m, int[] nums2, int n){
        int temp[]=new int[m+n];
        int left=0;
        int i=0;
        int right=0;
        while(left<m && right<n){
            if(nums1[left]<nums2[right]){
                temp[i]=nums1[left];
                left++;
                i++;
            }
            else{
                temp[i]=nums2[right];
                right++;
                i++;
            }
        }
        return temp;
    }
    public static void OptimalApproach(int a[],int b[]){
        int n1=a.length;
        int n2=b.length;
        int left=n1-1;
        int right=0;
        while(left>=0 && right<n2){
            if(a[left]>b[right]){
                int temp=a[left];
                a[left]=b[right];
                b[right]=temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
    }
    public static void main(String[] args) {
        int a[]={1, 4, 5, 7};
        int b[]={2, 3, 6};
        //optimal method
        OptimalApproach(a,b);
        for(int i:a) System.out.print(i+" ");
        System.out.println();
        for(int i:b) System.out.print(i+" ");
    }
}
