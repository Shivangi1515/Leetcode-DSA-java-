class Solution {
    public String build(String str){
        Stack<Character>st=new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        return st.toString();
    }
    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
        
    }
}