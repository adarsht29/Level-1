
  public static int size(Node node) {
 
    if(node==null){
        return 0;
    }
    int ls= size(node.left);
    int rs = size(node.right);
    int ts = ls+rs+1;
    return ts;
  }

  public static int sum(Node node) {

    if(node == null){
        return 0;
    }
    int ls = sum(node.left);
    int rs = sum(node.right);
    int tsum= ls+rs+node.data;
    return tsum;
  }

  public static int max(Node node) {

      if (node == null) {
    return Integer.MIN_VALUE;

  }
  int lm = max(node.left);
  int rm = max(node.right);
  int tm = Math.max(node.data, Math.max(lm, rm));
  return tm;
    
  }
  
  public static int height(Node node) {
   
     if (node == null) {
    return -1;

  }
  int lh = height(node.left);
  int rh = height(node.right);
  int th = Math.max(lh, rh) + 1;
  return th;
  }
