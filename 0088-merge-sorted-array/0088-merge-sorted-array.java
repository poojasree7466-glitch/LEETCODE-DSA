class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int i=0;
        int j=0;
        int index=0;
        while(i<m&&j<n)
        {
          if(nums1[i]<nums2[j])
          {
            arr[index++]=nums1[i];
            i++;
          }
          else
          {
            arr[index++]=nums2[j];
            j++;
          }
        }
        while(i<m)
        {
            arr[index++]=nums1[i];
            i++;
        }
        while(j<n)
        {
            arr[index++]=nums2[j];
            j++;
        }
        for(int k = 0; k < m+n; k++)
        {
            nums1[k] = arr[k];
        }
    }
}