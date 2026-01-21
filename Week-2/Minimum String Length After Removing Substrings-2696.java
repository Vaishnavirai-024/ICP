class Solution {
    public int minLength(String s) {
       Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray()){
        if(!st.isEmpty()){
            char temp=st.peek();
            if((temp=='A'&& ch=='B')||(temp=='C' && ch=='D')){
                st.pop();
                continue;
            }
        }
        st.push(ch);
       }
        return st.size();   
    }
}
