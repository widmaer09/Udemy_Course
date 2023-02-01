
//traversal of a tree

//level-vist nodes on each level
//preorder- visit the root of every subtree first
//post order visit the root of every subtree last
//in order visit left child,then root, then right child

//delete
//node is a leaf
//node has one child
//node has two children

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
//delete function

    public void delete (int value){
        root = delete(root,value);

    }

    private TreeNode delete(TreeNode subtreeRoot, int value){
        if (subtreeRoot == null){
            return subtreeRoot;
        }
        if(value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        if (value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));

        }
        else {
            //case 0 and 1 children
            if(subtreeRoot.getLeftChild()== null){
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() ==null) {
                return subtreeRoot.getLeftChild();

            }
            //case when we have two children to delete

            //replace the value in the subtreeroot node with the smallest value
            //from the right subtree

            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));


        }
        return subtreeRoot;
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
