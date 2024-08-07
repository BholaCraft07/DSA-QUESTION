public class Ceil_The_Floor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        int ceil=Ceil(a,n,x);
        int floor=Floor(a,n,x);
        ans[0]=floor;
        ans[1]=ceil;
        return ans;
      }
      public static int Ceil(int a[],int n,int x){
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
          int mid=(start+end)/2;
          if(a[mid]>=x){
            ans=a[mid];
            end=mid-1;
          }
          else start=mid+1;
        }
        return ans;
      }
      public static int Floor(int a[],int n,int x){
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
          int mid=(start+end)/2;
          if(a[mid]<=x){
            ans=a[mid];
            start=mid+1;
          }
          else end=mid-1;
        }
        return ans;
      }
      public static void main(String[] args) {
        int arr[]={3, 4, 7, 8, 8, 10};
        System.out.println("Ceil and Floor is");
        int[] ans=getFloorAndCeil(arr,arr.length, 5);
        System.out.println("ceil is "+ans[0]+" ans floor is "+ans[1]);
      }
}
