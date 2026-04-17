class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans=new int[2];
        int fp=-1;
        int lp=-1;
        int n=arr.length;
        // for first element 
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]){
                     high=mid-1;
                }
                else {
                    fp=mid; 
                    break;
                }
            }
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
        }
        // for last element 
         low=0;
         high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                if(mid+1<n && arr[mid]==arr[mid+1]){
                     low=mid+1;
                }
                else  {
                    lp=mid; 
                    break;
                    }
            }
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
        }
        ans[0]=fp;
        ans[1]=lp;
        return ans;
    }
}