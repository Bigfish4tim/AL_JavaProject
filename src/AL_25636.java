import java.util.*;

public class AL_25636 {

    static int cross;
    static int[] water;
    static int roadCount;
    static int[][] graph;
    static int[] distance;
    static int fireStation;
    static int fireLocation;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cross = sc.nextInt();

        for(int i=0; i<cross; i++) {
            water[i] = sc.nextInt();
        }

        roadCount = sc.nextInt();

        graph = new int[roadCount][2];

        for(int i=0; i<roadCount; i++) {
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
            distance[i] = sc.nextInt();
        }

        fireStation = sc.nextInt();
        fireLocation = sc.nextInt();
    }
}
