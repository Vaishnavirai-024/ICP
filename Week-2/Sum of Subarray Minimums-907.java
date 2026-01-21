class Solution {
     public int[] nsl(int[] arr,int n){
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return res;
     }
     public int[] nsr(int[] arr,int n){
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            res[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return res;
     }
    public int sumSubarrayMins(int[] arr) {
       int n=arr.length;
       int arr1[]=nsl(arr,n);
       int arr2[]=nsr(arr,n);
       long sum=0;
       int M = 1000000007;
       for(int i=0;i<n;i++){
            long d1=i-arr1[i];
            long d2=arr2[i]-i;
            long m1=d1*d2;
            long m2=arr[i]*m1;
            sum=(sum+m2)%M;
            
       }
       return (int)sum;


        
    }
}
