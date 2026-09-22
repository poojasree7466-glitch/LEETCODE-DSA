class Solution {
    public boolean isSubsequence(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        int l=0;
        int r=0;
        while(l<ch1.length&&r<ch2.length)
        {
            if(ch1[l]==ch2[r])
            {
                l++;
                r++;
            }
            else
            {
                r++;
            }
        }
        if(l==ch1.length)
        {
            return true;
        }
        return false;
    }
}