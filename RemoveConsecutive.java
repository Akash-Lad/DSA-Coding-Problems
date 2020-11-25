class solve
{
    // Function to print string after removing consecutive duplicates
    
    
    public static String removeConsecutiveDuplicates(String str){
        
        Stack<Character> stack = new Stack<Character>();
        String res = "";
        char[] ch = str.toCharArray();
        int len = ch.length;
        stack.push(ch[0]);
        for(int i=1;i<len;i++){
            if(stack.peek()!=ch[i])
                stack.push(ch[i]);
        }
        
        for(Character item:stack)
            res += item;
        
        
        return res;
        
    }
}