class StockSpanner {
    Stack<Integer>st;
    ArrayList<Integer>prices;
    int i;

    public StockSpanner() {
        st=new Stack<>();
        prices=new ArrayList<>();
        i=-1;
        

    }
    
    public int next(int price) {
        i++;
        prices.add(price);

        while(!st.isEmpty() && prices.get(st.peek())<=price){
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span=i+1;
        }
        else{
            int prevHigh=st.peek();
            span=i-prevHigh;

        }
        st.push(i);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */