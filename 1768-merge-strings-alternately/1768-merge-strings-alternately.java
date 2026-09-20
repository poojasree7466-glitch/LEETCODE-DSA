class Solution {
    public String mergeAlternately(String word1, String word2) {
        char ch1[]=word1.toCharArray();
        char ch2[]=word2.toCharArray();
        int m=ch1.length;
        int n=ch2.length;
        char ch3[]=new char[m+n];
        int i=0;
        int j=0;
        int index=0;
        while((i<m)&&(j<n))
        {
            ch3[index++]=ch1[i++];
            ch3[index++]=ch2[j++];
        }
        while(i<m)
        {
            ch3[index++]=ch1[i++];
        }
        while(j<n)
        {
            ch3[index++]=ch2[j++];
        }
        return String.valueOf(ch3);
    }
}