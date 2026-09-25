class Solution {
    public static boolean isPalindrome(char ch[],int l,int r)
    {
   while(l<r)
   {
    if(ch[l]!=ch[r])
{
    return false;
}
l++;
r--;
   }
   return true;
    }
    public boolean validPalindrome(String s) {
       char ch[]=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r)
        {
            if(ch[l]==ch[r])
            {
                l++;
                r--;
            }
            else
            {
               return isPalindrome(ch,l+1,r)||isPalindrome(ch,l,r-1);
            }
        }
        return true;
    }
}