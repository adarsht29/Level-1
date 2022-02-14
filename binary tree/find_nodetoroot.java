  public static boolean find(Node node, int data){

    if(node==null){
        return false;
        
    }
    if(node.data== data){
        return true;
        
    }
    boolean qw = find(node.left,data);
    if(qw){
        return true;
    }
    boolean wq =find(node.right,data);
    if(wq){
        return true;
    }
    return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
   
     if (node == null) {
    return new ArrayList<>();

  }
  if (node.data == data) {
    ArrayList list = new ArrayList<>();
    list.add(node.data);
    return list;
  }
  ArrayList llist = nodeToRootPath(node.left, data);
  if (llist.size() > 0) {
    llist.add(node.data);
    return llist;
  }
  ArrayList rlist = nodeToRootPath(node.right, data);
  if (rlist.size() > 0) {
    rlist.add(node.data);
    return rlist;
  }
  return new ArrayList<>();
    
  }
