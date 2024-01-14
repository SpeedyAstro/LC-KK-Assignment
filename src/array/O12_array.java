package array;
//https://leetcode.com/problems/find-the-highest-altitude/description/
public class O12_array {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxgain = altitude;
        for(int i : gain){
            altitude += i;
            maxgain = Math.max(maxgain,altitude);
        }
        return maxgain;
    }
}
