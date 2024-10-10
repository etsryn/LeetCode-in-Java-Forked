package g0501_0600.s0572_subtree_of_another_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Hash_Function #String_Matching
// #Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search
// #2022_08_10_Time_1_ms_(100.00%)_Space_47.2_MB_(13.44%)

import com_github_leetcode.TreeNode;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Base case: If root is null, subRoot can't be a subtree
        if (root == null) {
            return false;
        }

        // Check if trees rooted at root and subRoot are identical
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Otherwise, recursively check the left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Helper function to check if two trees are identical
    private boolean isSameTree(TreeNode s, TreeNode t) {
        // If both nodes are null, trees are identical
        if (s == null && t == null) {
            return true;
        }

        // If one of the nodes is null or the values are not equal, trees are not identical
        if (s == null || t == null || s.val != t.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
