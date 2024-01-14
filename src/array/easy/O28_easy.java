package array;

public class O28_easy {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int pos : position){
            if(pos%2==0){
                even++;
            }
        }
        return Math.min(even,position.length-even);

    }
}
