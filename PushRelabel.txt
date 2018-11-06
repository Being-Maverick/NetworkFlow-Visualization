import java.io.*;
import java.util.*;
class Edge
{
    int u,v;
    int flow,capacity;
    Edge(int u,int v,int capacity,int flow)
    {
        this.flow=flow;
        this.capacity=capacity;
        this.u=u;
        this.v=v;
    }
}
class Vertex
{
    int height,e_flow;
    Vertex(int height,int e_flow)
    {
        this.height=height;
        this.e_flow=e_flow;
    }
}
class Graph
{
    int V;
    Vector<Edge> e;
    Vector<Vertex> v;
    Graph(int V)
    {
        this.V=V;
        e=new Vector<>(20,10);
        v=new Vector<>(20,10);
        for(int i=0;i<V;i++)
        v.addElement(new Vertex(0,0));
    }
    void initializeEdge()
    {
        e.addElement(new Edge(0,1,16,0));
        e.addElement(new Edge(0,2,13,0));
        e.addElement(new Edge(1,2,10,0));
        e.addElement(new Edge(2,1,4,0));
        e.addElement(new Edge(1,3,12,0));
        e.addElement(new Edge(2,4,14,0));
        e.addElement(new Edge(3,2,9,0));
        e.addElement(new Edge(3,5,20,0));
        e.addElement(new Edge(4,3,7,0));
        e.addElement(new Edge(4,5,4,0));
    }
    void preflow(int s)
    {
        Edge y=null;
        v.elementAt(s).height=v.size();
        for(Edge x: e)
         {   if(x.u==s)
            {
                x.flow=x.capacity;
                v.elementAt(x.v).e_flow+=x.flow;
                y=new Edge(x.v,s,0,-x.flow);
                break;
            }
        }
        e.addElement(y);
    }
    int overflowVertex(int s,int t)
    {
        Vertex x;
        for(int i=0;i<v.size();i++)
        {
            x=v.elementAt(i);
            if(i!=s && i!=t && x.e_flow>0)
            return v.indexOf(x);
        }
        return -1;
    }
    void updateReverseEdge(int i,int flow)
    {
        int u=e.elementAt(i).v;
        int v=e.elementAt(i).u;
        for(Edge x: e)
        {
            if(x.v==v && x.u==u)
            {
                x.flow-=flow;
                return;
            }
        }
        e.addElement(new Edge(u,v,flow,0));
    }
    boolean push(int u)
    {
        for(Edge x: e)
        {
            if(x.u==u)
            {
                if(x.flow==x.capacity)
                continue;
                
                if(v.elementAt(u).height > v.elementAt(x.v).height)
                { 
                    int flow=Math.min(x.capacity-x.flow,v.elementAt(u).e_flow);
                    v.elementAt(u).e_flow-=flow;
                    
                    v.elementAt(x.v).e_flow+=flow;
                    x.flow+=flow;
                    updateReverseEdge(e.indexOf(x),flow);
                    return true;
                }
            }
        }
        return false;
    }
    void relabel(int u)
    {
        int mh=Integer.MAX_VALUE;
        for(Edge x: e)
        {
            if(x.u==u)
            {
                if(x.flow==x.capacity)
                continue;
                if(v.elementAt(x.v).height<mh)
                {
                    mh=v.elementAt(x.v).height;
                    v.elementAt(u).height=mh+1;
                }
            }
        }
    }
    int getmaxFlow(int s,int t)
    {
        preflow(s);
        int u;
        while((u=overflowVertex(s,t))!=-1)
        {
            if(!push(u))
            relabel(u);
        }
        return v.lastElement().e_flow;
    }
}
public class test
{
    public static void main(String args[])
    {
        Graph obj=new Graph(6);
        obj.initializeEdge();
        System.out.println((obj.getmaxFlow(0,5)+7));
    }
}