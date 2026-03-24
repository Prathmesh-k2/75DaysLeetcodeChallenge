class Solution {
      public static boolean binarysearch(int []arr,int n,int target){
        int low=0;
        int high=n-1;
        while(low <=high){
            int mid= (low+high)/2;
            
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){ 
                     low=mid+1;
        }
        else{
            return true;
        }
        }
        return false;
    
    }
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int n = nums.length;
        int target=original;
        
        while(  binarysearch(nums,n,target)){
                     target *=2;
        }
        
        return target;
    }
}