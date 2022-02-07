 public static int size(Node node){
    int totalsize=0;
    for (Node child : node.children) {
        totalsize +=size(child);
    }
    totalsize+=1;
    return totalsize;
  }
