import java.util.HashMap;
import java.util.Map;

/**
 * Created by HuGuodong on 2/22/20.
 */
public class LeetCode_105_364 {

  class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
      Map<Integer, Integer> inordermp = new HashMap<>();
      for (int i = 0; i < inorder.length; i++)
        inordermp.put(inorder[i], i);
      return helper(0, 0, preorder.length - 1, preorder, inordermp);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder,
        Map<Integer, Integer> inordermp) {
      // ter
      if (inStart > inEnd || preStart > preorder.length - 1) {
        return null;
      }
      //
      int index = inordermp.get(preorder[preStart]);
      TreeNode root = new TreeNode(preorder[preStart]);
      root.left = helper(preStart + 1, inStart, index - 1, preorder, inordermp);
      root.right = helper(preStart + 1 + (index - inStart), index + 1, inEnd, preorder, inordermp);
      return root;
    }
  }
}
