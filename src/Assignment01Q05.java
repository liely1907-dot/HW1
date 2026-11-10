public class Assignment01Q05{
    public static int findShortestPath(int[][] arr, int i, int j){
        if (i == j) {return 0;}
        boolean[] visited = new boolean [arr[0].length];
        int [] help = new int[arr[0].length];
        int head = 0, end = 0;
        help[end++] = i;
        visited[i] = true;
        int[] dist = new  int[arr[0].length];
        dist[i] = 0;
        while (head < end){
            int curr = help[head++];
            for (int k = 0; k < arr[0].length; k++){
                if (arr[curr][k] == 1 && !visited[k]){
                     visited[k] = true;
                     dist[k] = dist[curr] + 1;
                
                if (k == j){ return dist[k];}
                help[end++] = k;
                }

            }
        }
        return -1;
    }
}