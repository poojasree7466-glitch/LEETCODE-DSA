class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-3;i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
    continue;
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j > i+1 && nums[j] == nums[j-1])
    continue;
                int l=j+1;
        int r=nums.length-1;
              while(l<r)
        {
    long  sum=(long)nums[i]+nums[j];
    sum=sum+nums[l];
    sum=sum+nums[r];
    if(sum==target)
    {
List<Integer>al=new ArrayList<Integer>();
al.add(nums[i]);
al.add(nums[j]);
al.add(nums[l]);
al.add(nums[r]);
res.add(al);
while(l < r && nums[l] == nums[l+1])
    l++;

while(l < r && nums[r] == nums[r-1])
    r--;
l++;
r--;
    }
    else if(sum<target)
    {
        l++;
    }
    else
    {
        r--;
    }
        }
            }
        }
        return res;
    }
}