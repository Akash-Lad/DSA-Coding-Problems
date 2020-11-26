class Majority
{
    static int majorityElement(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
        
        int res = -1;
        
        if(n==1)
            res = arr[0];
        else{
            for(int i = 0; i < arr.length; i++) { 
                
                if (map.containsKey(arr[i])) { 
                        
                        int count = map.get(arr[i]) +1; 
                        if (count > arr.length /2) { 
                            res = arr[i];
                        }
                        else{
                            map.put(arr[i], count); 
                        }
                }
                else{
                    map.put(arr[i],1); 
                    
                }
            }
        }
        return res;
    } 
}