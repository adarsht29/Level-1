  public static Node createLeftCloneTree(Node node){
    
    if(node==null){
        return  null;
    }
    Node lcr = Node createLeftCloneTree(node.left);
    Node rcr = Node createLeftCloneTree(node.right);
    
    Node nn = new Node(node.data,lcr,null);
    node.left=nn;
    node.right=rcr;
    
  }
