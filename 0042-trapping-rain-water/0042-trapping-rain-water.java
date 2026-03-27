class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pmax[]=new int[n];
        int smax[]=new int[n];

        pmax[0]=height[0];
        for(int i=1 ;i<n; i++){
            pmax[i]=Math.max(pmax[i-1],height[i]);
        }
        smax[n-1]=height[n-1];
        for(int i=n-2; i>=0;i--){
            smax[i]=Math.max(smax[i+1],height[i]);
        }
        int ans=0;
        for(int i=0; i<n;i++){
            int waterlevel=Math.min(pmax[i],smax[i])-height[i];
            ans+=waterlevel;
        }

        return ans;
        
    }
}