package TREE;
public class Tree {
    public TreeNode root;
    
    
    TreeNode Node= new TreeNode();
    
    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }
    
    public void insert(int dataBaru){
        TreeNode NodeBaru = new TreeNode(dataBaru);
        if(root == null){
            root = new TreeNode(dataBaru);
        }else {
            TreeNode ptr = root;
            while(true){
                if (NodeBaru.getData() <= ptr.getData()) {
                    
                }
            }
        }
    }
    
    public TreeNode search(int Data){
        return null;
    }
    
    public TreeNode GetRoot(){
        return null;
    }
    
    public void setRoot(TreeNode Data){
        
    }
    
    public boolean isFull(){
        if (Node.getData() == null){
            return false;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String returnData = "";
        if(root.getData() == null){
            returnData = "Empty";
        }
        else if(root.getData() != null){
            TreeNode pointer = root;
            while(pointer != null){
                returnData += pointer.getData() + ",";
                pointer = pointer.rightNode;
            }
        }
        return returnData;
    }
}
