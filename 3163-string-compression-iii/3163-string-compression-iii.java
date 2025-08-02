class Solution {
    public String compressedString(String word) {

        StringBuilder comp=new StringBuilder();
        char ch=word.charAt(0);
        int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==ch && count<9){
                count++;
            }
            else{
                comp.append(count).append(ch);
                count=1;
                ch=word.charAt(i);
            }
        }
        comp.append(count).append(ch);
        return comp.toString();
          
    }
}