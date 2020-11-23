 public static int[] calculateSpan(int arr[], int n)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        
        for(int i=1; i<n; i++){
            
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i])
                s.pop();
            
            int v = s.isEmpty()? i+1 : i-s.peek(); 
            
            a.add(v);
            
            s.push(i);
            
        }
        
        int [] res = new int[a.size()];
        
        for(int i=0; i<a.size(); i++)
            res[i] = a.get(i);
        
        return res;
    }