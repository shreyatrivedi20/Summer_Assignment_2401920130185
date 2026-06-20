class MinStack {
Stack<Long> st=new Stack<>();
long min=Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
       long x=val;
        if(st.isEmpty()){
            min=x;
            st.push(x);
        }
        else{
            if(x>min){
                st.push(x);
            }
            else{
                st.push((2*x)-min);
                min=x;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty())   return; 
        else{
            long x1=st.pop();
            if(x1<min)  
            min=(2*min)-x1;
          }  
        }
    
    public int top() {
        if(st.isEmpty())  return -1;
        else{
            long a =st.peek();
            if(a>=min)  return (int) a ;
            else{
                return (int)min;
            }
        }   
    }
    
    public int getMin() {
        if(st.isEmpty())  return -1;
        return (int)min;
    }
}