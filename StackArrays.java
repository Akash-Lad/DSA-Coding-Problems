class MyStack{

    int top;
    int arr[] = new int[1000];

    MyStack()
	{
	   top = -1;
	}
	
	/* The method push to push element into the stack */

    void push(int a)
	{
	    if(top==-1 || top<arr.length){
	    top++;
	    arr[top] = a;
	    }
	} 
	
    /* The method pop which return the element poped out of the stack*/

    int pop(){

	    int res;
	    if(top==-1)
	        return -1;
	    else{
            res = arr[top];
            top--;
	}
        return res;
    }
    
}