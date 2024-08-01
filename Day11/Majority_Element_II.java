import java.util.ArrayList;
import java.util.List;

/**
 * Majority_Element_II
 */
public class Majority_Element_II {
    public static List<Integer> Majority(int ar[]){
        List<Integer> ans=new ArrayList<>();
        int n=ar.length;
        int c1=0,c2=0;
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(c1==0 && e2!=ar[i]){
                c1=1;
                e1=ar[i];
            }
            else if(c2==0 && e1!=ar[i]){
                c2=1;
                e2=ar[i];
            }
            else if(ar[i]==e1)c1++;
            else if(ar[i]==e2)c2++;
            else{
                c1--;
                c2--;
            }
        }

        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(e1==ar[i])c1++;
            if(e2==ar[i])c2++;
        }
        int major=n/3+1;
        if(c1>=major) ans.add(e1);
        if(c2>=major) ans.add(e2);

        return ans;

    }    
    public static void main(String[] args) {
        int ar[]={1,1,1,2,2,2,3,3,};
        System.out.println(Majority(ar));
    }
}