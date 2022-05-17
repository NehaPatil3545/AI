import java.util.*;
public class krushkal{
	public static int V=5;
	public static int parents[]=new int[V];
	public static int INF=999999;
	public static int find(int i){
		while(parents[i]!=i)
			i=parents[i];
			return i;
	}
	public static void update(int i,int j){
		int a=find(i);
		int b=find(j);
		parents[a]=b;
	} 
	public static void findcost(int [][] cost){
		int mincost=0;
		
		int edgecount=0;
		for(int i=0;i<V;i++){
			parents[i]=i;
		}
		while(edgecount<V-1){
			int min=INF;
		int a=0;
		int b=0;
			for(int i=0;i<V;i++){
				for(int j=0;j<V;j++){
					if(find(i)!=find(j) && cost[i][j]<min){
						min=cost[i][j];
						a=i;
						b=j;
					}
				}
			}
			update(a,b);
			edgecount++;
			System.out.println("Edge"+ edgecount +" "+a+"-"+b+" "+"cost-"+min);
			mincost+=min;
		}	
		
		System.out.println("total cost:"+mincost);
	}
	public static void main(String args[]){
		int[][] cost={{INF,2,INF,6,INF},{2,INF,3,8,5},{INF,3,INF,INF,7},{6,8,9,INF,INF},{INF,5,7,9,INF}};
		findcost(cost);
	}
}