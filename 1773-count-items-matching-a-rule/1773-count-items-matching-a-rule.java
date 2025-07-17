class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       
        int index;

        if(ruleKey.equals("type")){
            index=0;
        }
        else if(ruleKey.equals("color")){
            index=1;
        }
        else{
            index=2;
        }
        int count=0; // for counting number of items that matches the value

        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}