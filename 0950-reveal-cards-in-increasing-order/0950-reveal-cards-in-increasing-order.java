class Solution{
    public int[] deckRevealedIncreasing(int[] deck){
        Deque<Integer> dq=new ArrayDeque<>();
        int[] ans=new int[deck.length];
        Arrays.sort(deck);
        for(int i=deck.length-1;i>=0;i--){
            if(!dq.isEmpty()) dq.offerFirst(dq.pollLast());
            dq.offerFirst(deck[i]);
        }
        for(int i=0;i<deck.length;i++) ans[i]=dq.pollFirst();
        return ans;
    }
}