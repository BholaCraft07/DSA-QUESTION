public class Merge_TwoSorted_ArrayWithout_UsingExtraSpace {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
      int p2 = n-1;
      int p = m+n-1;
      
      while(p1>=0 && p2>=0)
      {
          if(nums1[p1]>nums2[p2])
          {
              nums1[p] = nums1[p1];
              p1--;
          }
          else
          {
              nums1[p] = nums2[p2];
              p2--;
          }
          p--;
      }
      while(p2>=0)
      {
          nums1[p]=nums2[p2];
          p2--;
          p--;
      }
  }
  public static void main(String[] args) {
    int ar1[]={1,2,3,0,0,0};
    int ar2[]={2,5,6};
    int m=3;
    int n=3;
    merge(ar1,m,ar2,n);
    for(int i:ar1){
        System.out.print(i+"  ");
    }
    System.out.println();
    for(int i:ar2){
        System.out.print(i+"  ");
    }
    System.out.println();
  }
}
