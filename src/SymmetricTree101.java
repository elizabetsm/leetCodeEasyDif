public class SymmetricTree101 {

        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return false;
            }
            return isSymmetric(root, root);
        }

        public boolean isSymmetric(TreeNode node1, TreeNode node2) {
            if (node1 == null && node2 == null ) {
                return true;
            }
            if (node1 == null || node2 == null) {
                return false;
            }

            if (node1.val == node2.val) {
                return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
            }
            return false;
        }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
