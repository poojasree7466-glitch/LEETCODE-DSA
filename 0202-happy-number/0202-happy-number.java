class Solution {
   
    public static int sum(int n)
    {
         int sum=0;
        while(n>0)
        {
        int digits=n%10;
        sum=sum+digits*digits;
        n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer>hs=new HashSet<>();
        if(n==1)
        {
            return true;
        }
        while(n!=1&&!hs.contains(n))
        {
            hs.add(n);
            n=sum(n);
        }
        if(hs.contains(n))
        {
        return false;
        }
        return true;
    }
}