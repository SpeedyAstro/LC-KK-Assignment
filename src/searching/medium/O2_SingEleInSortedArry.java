package searching.medium;


// array is sorted and pattern is indexes follow odd even like first element is equal to second (even index 0, odd index 1)
// so basically it follow this even == odd but any element found in between the array whose pair doesn't exists then
// after that single element pattern changes to odd == even
public class O2_SingEleInSortedArry {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length==1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int l = 1 , r = nums.length-2;
        while (l<=r){
            int mid = l + (r - l)/2;
            if (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            if ((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid] == nums[mid+1])) l = mid+1;
            else r = mid - 1;
        }
        return -1;
    }
}
