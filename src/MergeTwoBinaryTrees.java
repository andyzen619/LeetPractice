public class MergeTwoBinaryTrees {

    private TreeNode resultTreeNode;

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            value = val;
        }

        public boolean hasChildren() {
            boolean result = false;
            if((this.left != null) || (this.right != null)) {
                result = true;
            }
            return true;
        }

        public void copyLeftNode(int Value) {
            left = new TreeNode(value);
        }

        public void copyRightNode(int Value) {
            right = new TreeNode(value);
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        while(t1.hasChildren() || t2.hasChildren()) {
            //TODO:
        }
        return null;
    }
}
