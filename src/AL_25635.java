import java.util.*;

public class AL_25635 {
    static int max = 0;

    static void dfs(int nodeIndex, int[][] graph, int[] visit) {
        visit[nodeIndex]--;

        for(int i=0; i< graph[nodeIndex].length; i++) {
            if(visit[i] != 0) {
                dfs(i, graph, visit);
                max++;
                System.out.println(max);
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

        int[][] graph = new int[count][count-1];

        for(int i=0; i<count; i++) {
            int jcount = 0;
            for(int j=0; j<count; j++) {
                if(i != j) {
                    graph[i][jcount] = j;
                    jcount++;
                }
            }
        }

        dfs(0, graph, visit);
    }
}
