class Solution {
     public int[] nsl(int[] nums,int n){
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return res;
     }
     public int[] nsr(int[] nums,int n){
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return res;
     }
    public int maxSumMinProduct(int[] nums) {
       int n=nums.length;
       int MOD = 1_000_000_007;
       int arr1[]=nsl(nums,n);
       int arr2[]=nsr(nums,n);
      long prefix[]=new long[n+1];

      for(int i=0;i<n;i++){
        prefix[i+1]=prefix[i]+nums[i];
      }

      long max=0;
      for(int i=0;i<n;i++){
        int l=arr1[i]+1;
        int r=arr2[i]-1;
        long sum=prefix[r+1]-prefix[l];
        long multi=sum*nums[i];
        max=Math.max(max,multi);
      }
       
       return (int)(max%MOD);
    }
}
