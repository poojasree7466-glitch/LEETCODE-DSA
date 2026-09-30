class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int arr[]=new int[m];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0;
        int r=0;
          int k=0;
        int n=nums2.length;
        while(l<m&&r<n)
        {
            while(l>0&&l<m&&nums1[l]==nums1[l-1])
            {
                l++;
            }
            while(r>0&&r<n&&nums2[r]==nums2[r-1])
            {
                r++;
            }
            if(l==m||r==n)
            {
                break;
            }
            if(nums1[l]<nums2[r])
            {
                l++;
            }
             else if(nums1[l]>nums2[r])
            {
                r++;
            }
            else
            {
              
                arr[k]=nums1[l];
                k++;
                l++;
                r++;
            }
        }
        return Arrays.copyOf(arr,k);
    }
}