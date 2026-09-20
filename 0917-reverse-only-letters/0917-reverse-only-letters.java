class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r)
        {
            if(Character.isLetter(ch[l])&&Character.isLetter(ch[r]))
            {
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
            else if(!Character.isLetter(ch[l]))
            {
              l++;
            }
            else
            {
                r--;
            }
        }
        return String.valueOf(ch);
    }
}