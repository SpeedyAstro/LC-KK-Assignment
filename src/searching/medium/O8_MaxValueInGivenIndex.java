package searching.medium;

public class O8_MaxValueInGivenIndex {
        public int maxValue(int n, int index, int maxSum) {
            long result = 0;
            long start = 1, end = maxSum;
            while (start <= end) {
                long mid = start + (end - start) / 2;
                long left_sum = calculate(index, mid);
                long right_sum = calculate(n - index - 1, mid);
                long total_sum = left_sum + right_sum + mid;
                if (total_sum <= maxSum) {
                    result = Math.max(result, (int)mid);
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return (int)result;
        }

        public long calculate(int count, long right) {
            long size = Math.min(count, right - 1);
            long sum = (size * right) - (size * (size + 1)) / 2;
            sum += Math.max(0, count - right + 1);
            return sum;
        }
}
