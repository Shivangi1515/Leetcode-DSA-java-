class Solution {
    public boolean isPalindrome(String s) {

        String cleaned="";

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                cleaned+=Character.toLowerCase(ch);
            }

        }

        String rev="";
        for(int i=cleaned.length()-1;i>=0;i--){
            rev+=cleaned.charAt(i);
        }

        return rev.equals(cleaned);



        
    }
}