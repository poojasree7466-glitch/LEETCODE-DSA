class Solution {
    public static String swap(int l,int r,char ch[])
    {
while(l<r)
        {
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
        }
        return String.valueOf(ch);
    }
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        if(ch.length==1)
        {
            return String.valueOf(ch);
        }
        int l=0;
        int r=k-1;
        while(l<ch.length)
        {
            r = Math.min(r, ch.length - 1);
            swap(l,r,ch);
      l=l+2*k;
      r=r+2*k;
        }
        return String.valueOf(ch);
    }
}