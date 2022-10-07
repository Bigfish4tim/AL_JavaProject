import java.util.*;

public class AL_25635 {
    static int max = 0;

    static int[][] graph;

    static void dfs(int nodeIndex, int[][] graph, int[] visit, int visitcount) {
        visit[nodeIndex]--;

        for(int i=0; i< graph[nodeIndex].length; i++) {
            int visitcountClone = 0;
            if(visit[graph[nodeIndex][i]] != 0) {
                int[] visitClone = visit.clone();
                visitcountClone = visitcount+1;
                dfs(graph[nodeIndex][i], graph, visitClone, visitcountClone);
            }
            if(visitcount > max) {
                max = visitcount;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] visit = new int[count];

        for(int i=0; i<count; i++) {
            visit[i] = sc.nextInt();
        }

        graph = new int[count][count-1];

        for(int i=0; i<count; i++) {
            int jcount = 0;
            for(int j=0; j<count; j++) {
                if(i != j) {
                    graph[i][jcount] = j;
                    jcount++;
                }
            }
        }

        for(int i=0; i<count; i++) {
            int[] visitClone = visit.clone();
            dfs(i, graph, visitClone, 1);
        }

        System.out.println(max);
    }
}
