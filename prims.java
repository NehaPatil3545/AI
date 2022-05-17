import java .util.*;
public class prims{
	public static void findcost(int[][] cost,int v){
		boolean selected[]=new boolean[v];
		Arrays.fill(selected,false);
		selected[0]=true;
		int inf=9999999;
		
		int edgecount=0;
		while(edgecount<v-1){
			int min=inf;
			int a=0,b=0;
			for(int i=0;i<v;i++){
				if(selected[i]==true){
					for(int j=0;j<v;j++){
						if(selected[j]==false && cost[i][j]!=0){
							if(min>cost[i][j]){
								min=cost[i][j];
								a=i;
								b=j;
							}
						}
					}
				}
			}
			edgecount++;
			System.out.println("Edge"+edgecount+a+"-"+b+"cost "+min);
			selected[b]=true;
		}	
	}
	public static void main(String args[]){
		int v=5;
		int[][] cost={{0,9,75,0,0},{9,0,95,19,42},{75,95,0,51,66},{0,19,51,0,31},{0,42,66,31,0}};
		findcost(cost,v);
		
}	
}