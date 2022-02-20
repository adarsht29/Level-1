    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        
        HashMap<Character,Integer> c = new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(c.containsKey(ch)){
                int of= c.get(ch);
                int nf=of+1;
                c.put(ch,nf);
            }else{
                c.put(ch,1);
            }
        }
        
        char mfc =a.charAt(0);
        for(Character key: c.keySet()){
            if(c.get(key)>c.get(mfc)){
                mfc=key;
            }
        }
        System.out.println(mfc);
    }
