package niuke.offer;

public class TreeNodeConvert {

    public TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree==null)
            return
        Convert(pRootOfTree.left);

        return null;
    }
}
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}