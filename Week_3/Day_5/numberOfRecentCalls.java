class RecentCounter {
    Queue <Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        if(queue.size() == 0){
            queue.add(t);
            return queue.size();
        }
        else{
            if( t <= 3000){
                queue.add(t);
            }
            else{
                int margin = t - 3000;
                while(queue.size() != 0 && margin > queue.peek()){
                    queue.poll();
                }
                queue.add(t);
            }
            return queue.size();
        }
    }
}