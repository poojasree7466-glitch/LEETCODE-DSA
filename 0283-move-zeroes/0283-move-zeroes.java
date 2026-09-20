class Solution {
    public void moveZeroes(int[] nums) {
        int nz=0;
        int z=0;
     while(nz<nums.length)
     {
        if(nums[nz]!=0)
        {
          int temp=nums[nz];
          nums[nz]=nums[z];
          nums[z]=temp;
          nz++;
          z++;
        }
        else if(nums[nz]!=0&&nums[z]!=0)
        {
            nz++;
            z++;
        }
        else
        {
            nz++;
        }

     }
    }
}