package Trees.ques;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ClosestNodesQueriesinaBinarySearchTree {
//    :Not working
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> array = getSortedList(root);
        List<List<Integer>> result = new ArrayList<>();
        return result;
    }

    private void binarySearch(List<Integer> array, int query,List<Integer> result ) {

    }

    public List<Integer> getSortedList(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> left = getSortedList(root.left);
        List<Integer> right = getSortedList(root.right);
        result.addAll(left);
        result.add(root.val);
        result.addAll(right);
        return result;
    }

}
