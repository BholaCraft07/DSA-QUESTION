public class Minimum_days_to_make_M_bouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)return -1;
        int start=Integer.MAX_VALUE;//find minimum value
        int end=Integer.MIN_VALUE;//find maximum value
        for(int i=0;i<bloomDay.length;i++){
         start=Math.min(start,bloomDay[i]);
         end=Math.max(end,bloomDay[i]);
        }
        int ans=-1;
        while(start<=end){
         int mid=(start+end)/2;
         if(check(bloomDay,mid,m,k)){
             end=mid-1;
             ans=mid;
 
         }
         else start=mid+1;
        }
        return ans;
     }
     public static boolean check(int bloomDay[],int d,int m,int k ){
         int count=0;
         int total=0;
         for(int i=0;i<bloomDay.length;i++){
             if(bloomDay[i]<=d){
                 count++;
             }
             else{
                 total+=count/k;
                 count=0;
             }
         }
         total+=count/k;
         if(total>=m) return true;
         else return false;
     }
     public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k));

     }
}
