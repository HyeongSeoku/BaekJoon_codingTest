public class SumN {
    long sum(int[] a)
    {
        long ans=0;
        for(int i=0;i<a.length;i++)
        {
            ans+=a[i];
        }
        return ans;
    }

    
}