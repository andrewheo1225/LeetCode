public class maximumWealth {
    public int Wealth(int[][] accounts) {
        int max = 0;
        int total = 0;
        for(int row = 0; row < accounts.length; row++){
            for(int col = 0; col < accounts[row].length; col++){
                total+=accounts[row][col];
            }
            if(total > max){
                max = total;
            }
            total = 0;
        }
        return max;
    }
}
