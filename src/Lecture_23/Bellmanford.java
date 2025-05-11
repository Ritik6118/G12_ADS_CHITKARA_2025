package Lecture_23;

public class Bellmanford {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int [] dist=new int [V];
        for(int i=0;i<dist.length;i++) {
        	if(i==src) {
        		dist[i]=0;
        	}
        	else {
        		dist[i]=(int)(1e9);
        	}
        }
        for(int i=1;i<V;i++) {
        	for(int [] arr:edges) {
        		int v1=arr[0];
        		int v2=arr[1];
        		int c=arr[2];
        		if(arr[v1]!=(int)(1e9) && arr[v1]+c<arr[v2]) {
        			arr[v2]=arr[v1]+c;
        		}
        	}
        }
        
        for(int [] arr:edges) {
    		int v1=arr[0];
    		int v2=arr[1];
    		int c=arr[2];
    		if(arr[v1]!=(int)(1e9) && arr[v1]+c<arr[v2]) {
    			int [] ans= {-1};
    			return ans;
    		}
    	}
        return dist;
    }

}
