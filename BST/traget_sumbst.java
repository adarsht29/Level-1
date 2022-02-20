 public static boolean find(Node node,int cmp){
      
      if(node==null) {
          return false;
      }
      if(cmp>node.data){
          return find(node.right,cmp);
      }else if(cmp<node.data){
          return find(node.left,cmp);
      }else return true;
      
  }
  public static void travel(Node root, Node node,int tar){
      if(node==null) return;
      travel(root,node.left, tar);
      int cmp=tar-node.data;
      
      if(node.data<cmp){
      
          if(find(root,cmp)==true){
              System.out.println(node.data+" "+ cmp);
          }
      }
      travel(root,node.right, tar);
  }
