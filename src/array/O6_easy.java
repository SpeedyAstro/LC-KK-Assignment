package array;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
import java.util.ArrayList;
import java.util.List;

public class O6_easy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // get the max candies a kid have
        // Iterated through every kid and add extra candies
        // check if max out the max candies of one kid
        // if yes return true;
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int max = getMaxCandies(candies);
        for(int candy : candies){
            // if((candy+extraCandies)> max)
            ans.add((candy+extraCandies)>= max);
        }
        return ans;
    }
    public int getMaxCandies(int [] candies){
        int max = 0;
        for(int candy : candies){
            if(max<candy) max = candy;
        }
        return max;
    }
}
