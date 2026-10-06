class Solution {
    public static int count(int nums[],int target)
    {
        int l=0;
        int h=nums.length-1;
        int res=-1;
        while(l<=h)
        {
         int mid=l+(h-l)/2;
         if(nums[mid]==target)
         {
            res=mid;
            l=mid+1;
         }
         else if(target<nums[mid])
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int l=0;
        int h=nums.length-1;
        int res=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
            {
               res=mid;
               h=mid-1;
            }
            else if(target<nums[mid])
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        a[0]=res;
        a[1]=count(nums,target);
        return a;
    }
}