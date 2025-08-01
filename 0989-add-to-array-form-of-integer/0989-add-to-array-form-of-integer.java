class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> answer=new ArrayList<>();

        int i=num.length-1;

        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
                i--;

            }
            answer.add(k%10);
            k/=10;
        }
        Collections.reverse(answer); //reverses the list in place
        return answer;
        
    }

}