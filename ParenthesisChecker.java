class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean check(char a, char b){
        
        return ((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'));
        
    }
    
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<Character>();
        
        char [] ch = x.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
                stack.push(ch[i]);
            else{
                
                if(stack.isEmpty()==true)
                    return false;
                else if(check(stack.peek(),ch[i])==false)
                    return false;
                else
                    stack.pop();
                
                
            }
            
            
        }
        
        return stack.isEmpty();
    }
}