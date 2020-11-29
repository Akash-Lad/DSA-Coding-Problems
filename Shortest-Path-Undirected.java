static void BFS(ArrayList<ArrayList<Integer>> adj,int v,int s){

        int max = 1000;
        int dist[] = new int[v];

        for(int i=0;i<v;i++)
            dist[i] = max;

        dist[0] = 0;

        boolean [] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){

            int u = queue.poll();

            for(int i:adj.get(u)){

                if(visited[i]==false){
                    dist[i] = dist[u]+1;
                    visited[i] = true;
                    queue.add(i);

                }
            }
        }

        for(int i:dist)
            System.out.print(i+" ");


    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){

        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static void main(String []args){

        int vertex = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<vertex;i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        BFS(adj,vertex,0);


    }