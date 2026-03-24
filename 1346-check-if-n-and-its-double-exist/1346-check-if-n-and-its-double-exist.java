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
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int target=arr[i]*2;
            boolean result = binarysearch(arr,n,target);
                if(result==true  ){
                    if(arr[i]==0){
                        if(i -1>=0 && arr[i-1]==0){
                            return true;
                        }
                        if(i+1<n && arr[i+1]==0){
                            return true;
                        }
                    }
                    else
                    return true;
                }
            }
        
          return false;
        
    }
}