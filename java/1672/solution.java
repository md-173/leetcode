class Solution {
    public int maximumWealth(int[][] accounts) {
        int curWealth = 0;
        int maxWealth = 0;
        int colLength = accounts.length;
        int rowLength = accounts[0].length;
        
        for(int i = 0; i < colLength; i++) {    
            curWealth = 0;
            for(int j = 0; j < rowLength; j++) {
                curWealth += accounts[i][j];
            }
            maxWealth = Math.max(curWealth, maxWealth);
        }
        return maxWealth;
    }
}
