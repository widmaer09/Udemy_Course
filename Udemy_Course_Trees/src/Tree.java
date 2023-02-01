
//traversal of a tree

//level-vist nodes on each level
//preorder- visit the root of every subtree first
//post order visit the root of every subtree last
//in order visit left child,then root, then right child



public class Tree {
    private TreeNode root;
    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);

        }
        else{
            root.insert(value);
        }
    }

    public void TraverseInorder(){
        if(root != null){
            root.traverseInorder();
        }

    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
        if(root==null){
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }
    }
    public int max(){
        if(root==null){
            return Integer.MAX_VALUE;
        }else {
            return root.max();
        }
    }

}
