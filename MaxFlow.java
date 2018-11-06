import java.util.*;
import java.io.*;
import java.util.LinkedList;
class MaxFlow
{
    static final int V=6;
    boolean bfs(int rgraph[][],int s,int t,int parent[])
    {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(s);
        visited[s]=true;
        parent[s]=-1;
        
        while(queue.size()!=0)
        {
            int u=queue.poll();
            for(int v=0;v<V;v++)
            {
                if(visited[v]==false && rgraph[u][v]>0)
                {
                    queue.add(v);
                    visited[v]=true;
                    parent[v]=u;
                }
            }
        }
        return visited[t];
    }
    int fordFulkerson(int graph[][],int s,int t)
    {
        int rgraph[][]=new int[V][V];
        int u,v;
        for(u=0;u<V;u++)
        {
            for(v=0;v<V;v++)
            {
                rgraph[u][v]=graph[u][v];
            }
        }
        int parent[]=new int[V];
        int maxflow=0;
        
        while(bfs(rgraph,s,t,parent))
        {
            int pathflow=Integer.MAX_VALUE;
            for(v=t;v!=s;v=parent[v])
            {
                u=parent[v];
                pathflow=Math.min(pathflow,rgraph[u][v]);
            }
            for(v=t;v!=s;v=parent[v])
            {
                u=parent[v];
                rgraph[u][v]-=pathflow;
                rgraph[v][u]+=pathflow;
            }
            maxflow+=pathflow;
        }
        return maxflow;
    }
    int initialize()
    {
         int graph[][]=new int[][] { {0, 16, 13, 0, 0, 0}, 
                                     {0, 0, 10, 12, 0, 0}, 
                                     {0, 4, 0, 0, 14, 0}, 
                                     {0, 0, 9, 0, 0, 20}, 
                                     {0, 0, 0, 7, 0, 4}, 
                                     {0, 0, 0, 0, 0, 0} 
                                   };
                                   return fordFulkerson(graph,0,5);
    } 
}