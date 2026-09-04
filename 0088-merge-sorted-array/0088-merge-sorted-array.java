class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[] c= new int[m+n];
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
               c[k]=nums1[i];
                i++;
                k++;
            }else if(nums1[i]>=nums2[j]){
                c[k]=nums2[j];
                j++;
                k++;
            }
             
        }

        if(i==m){
            while(j<n){
                 c[k]=nums2[j];
                j++;
                k++;
            }
        }

        if(j==n){
            while(i<m){
                c[k]=nums1[i];
                i++;
                k++;
            }
        }

        for(int a=0;a<c.length;a++){
            nums1[a]=c[a];
        }
         
    }
}