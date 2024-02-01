package searching.medium;

public class O9_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        long start = 1, end = 0;
        for (int pile : piles) end = Math.max(end, pile);
        while (start < end) {
            long mid = start + (end - start) / 2;
            if (canEat(piles, mid, h)) end = mid - 1;
            else start = mid + 1;
        }
        return (int) start;
    }

    public static boolean canEat(int[] piles, long speed, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (int) (pile / speed);
            if (pile % speed != 0) hours++;
        }
        return hours <= h;
    }

    public static void main(String[] args) {
        O9_KokoEatingBananas obj = new O9_KokoEatingBananas();
        System.out.println(obj.minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000));
    }
}
