static void DfsRecursion(ArrayList<ArrayList<Integer>> adj,int v,
                             int s,boolean [] visited){

        visited[s] = true;
        System.out.print(s+" ");
        for(int i:adj.get(s)){

            if(visited[i] == false){
                DfsRecursion(adj,v,i,visited);
            }

        }


    }

    static void DFS(ArrayList<ArrayList<Integer>> adj,int v,int s){

        boolean [] visited = new boolean[v];

        DfsRecursion(adj,v,s,visited);

    }


    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static void main(String [] args){

        int vertex = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<vertex;i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        addEdge(adj,3,4);


        
        DFS(adj,vertex,0);




    }