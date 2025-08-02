class Solution {
    public String toLowerCase(String s) {

        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            boolean flag=false; //lowercase 

            int ascii=(int)ch;

            if(ascii>=65 && ascii<=90){
                flag=true;
            }
            if(flag==true){
                ascii+=32;
            }

            char dh=(char)ascii;
            result.append(dh);
            
        }
        return result.toString();
        
        
    }
}