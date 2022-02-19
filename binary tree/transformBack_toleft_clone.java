
  public static Node transformbackLeftCloneTree(Node node){
    
    if(node==null){
        return  null;
    }
    Node lcr =  transformbackLeftCloneTree(node.left.left);
    Node rcr =  transformbackLeftCloneTree(node.right);
    
    node.left=lcr;
    node.right=rcr;
    return node;
  }
