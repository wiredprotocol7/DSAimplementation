 public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val > key) {root.left=deleteNode(root.left,key);}
        else if(root.val < key) {root.right=deleteNode(root.right,key);}
        else {
            if(root.left==null || root.right==null){
                root=(root.left==null) ? root.right : root.left;
            }else{
                TreeNode curNode=root.right;
                while(curNode.left!=null) curNode=curNode.left;
                root.val=curNode.val;
                root.right=deleteNode(root.right,curNode.val);
            }
        }
        
        return root;
    }
    
    
    //taken from https://leetcode.com/problems/delete-node-in-a-bst/discuss/385366/very-easy-to-understand
