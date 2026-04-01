class Solution {
    public List<Integer> majorityElement(int[] nums) {
      
        List<Integer> result = new ArrayList<>();
        if(nums.length == 0) return result;
         int majority1 = 0, majority2 = 0;
        int count1 = 0, count2 = 0;

        for(int i=0; i<nums.length;i++){
            if(majority1==nums[i]){
                count1++;
            }
            else if(majority2==nums[i]){
                count2++;
            }
            else if(count1 == 0) {
                majority1 = nums[i];
                count1 = 1;
            } 
            else if(count2 == 0) {
                majority2 = nums[i];
                count2 = 1;
            } 
            else {
                count1--;
                count2--;
            }
            }

        
        count1=0;
        count2=0;
       for(int i=0;i<nums.length;i++){
        if(majority1==nums[i]){
            count1++;
        }
        else if(majority2==nums[i]){
            count2++;
        }
       }
            int n = nums.length;

        if(count1 > n / 3) result.add(majority1);
        if(count2 > n / 3) result.add(majority2);

        return result;
        
    }
}
