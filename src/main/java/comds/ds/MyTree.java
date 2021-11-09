package comds.ds;

public class MyTree<T> {
    TreeNode<T> root;

    public TreeNode<T> add(T data){

        TreeNode newNode = new TreeNode(data);
        if(root == null){
            return newNode;
        }return null;


    }
}
