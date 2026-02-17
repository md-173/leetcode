class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friendSet = new HashSet<>();
        int[] finishingOrder = new int[friends.length];
        for(int friend : friends) {
            friendSet.add(friend);
        }

        int i = 0;
        for(int participant : order) {
            if(friendSet.contains(participant)){
                finishingOrder[i] = participant;
                i++;
            }
        }

        return finishingOrder;
    }
}
