class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int l=0;
        int r=people.length-1;
        Arrays.sort(people);
        while(l<r)
        {
            int s=people[l]+people[r];
            
        
            if(s<=limit)
            {
                count++;
                l++;
                r--;
            }
            if(s>limit)
            {
              count++;
              r--;
            }
           
        }
        if(l==r)
        {
            count++;
        }
       
         return count;
    }
}
