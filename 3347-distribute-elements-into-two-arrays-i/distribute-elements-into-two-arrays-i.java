class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int n=nums.length;
        for(int i=2;i<n;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int[] result=new int[n];
        for(int i=0;i<arr1.size();i++){
            result[i]=arr1.get(i);
        }
      
        for(int i=arr1.size(),j=0;i<n && j<arr2.size();j++,i++){
            result[i]=arr2.get(j);
        }
        return result;
    }
}