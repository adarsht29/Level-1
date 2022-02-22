public static void main(String[] args) throws Exception {
   
    Scanner sc = new Scanner(System.in);
    int n1= sc.nextInt();
    int []a1= new int[n1];
    
    for(int i=0;i<n1;i++){
        a1[i]=sc.nextInt();
    }
    int n2= sc.nextInt();
    int []a2= new int[n2];
    
    for(int i=0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    
    
    HashMap<Integer, Integer> hmap= new HashMap<>();
    
    
    for(int val: a1){
       if(hmap.containsKey(val)){
           int of =hmap.get(val);
           int nf =of+1;
           hmap.put(val,nf);
       }else{
           hmap.put(val,1);
       }
     }
     
     for(int val2: a2){
         if(hmap.containsKey(val2) && hmap.get(val2)>0){
            System.out.println(val2); 
            int of =hmap.get(val2);
            int nf =of-1;
            hmap.put(val2,nf);
         }   
    }
}
