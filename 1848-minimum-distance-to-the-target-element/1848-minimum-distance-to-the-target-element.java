class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int low=0;
        int high=n;
        // if(nums[0]==target){
        //     return start-0;
        // }
        // while(low < high){
        //     int mid= (high+low)/2;
        //     if(nums[mid]==target){
        //         return mid-start;
        //     }
        //     else if( mid < target){
        //         low=mid+1;
        //     }
        //     else{
        //         high=mid-1;
        //     }
        // }
        // return -1;
        int minDist = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                 minDist = Math.min(minDist, Math.abs(i - start));
            }
        }
        return minDist;
        
    }
}