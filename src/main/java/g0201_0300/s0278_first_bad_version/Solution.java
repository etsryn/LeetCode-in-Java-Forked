package g0201_0300.s0278_first_bad_version;

// #Easy #Binary_Search #Interactive #Algorithm_I_Day_1_Binary_Search #Binary_Search_I_Day_5
// #Level_1_Day_7_Binary_Search #2022_07_06_Time_15_ms_(87.89%)_Space_39.3_MB_(85.40%)

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2; // To prevent overflow
            
            if (isBadVersion(mid)) {
                right = mid; // Move left
            } else {
                left = mid + 1; // Move right
            }
        }
        
        // left == right, at this point it's the first bad version
        return left; 
    }
}
