import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AL_25637_b {
    static int N;
    static int[] merry;
    static int[] dx = new int[] { -1, 1 };
    static int max = Integer.MAX_VALUE;

    public void dfs(int[] map, int x, int count, int dir) {
        if(isOne()) {
            if(max < count)
                max = count;

            return;
        }


        for(int i=0; i<2; i++) {
            int next = x+dx[i];

            if(next < 0)
                next = N-1;
            if(next >= N)
                next = 0;

            if(map[x] > 1) {
                if(map[next] == 0) {

                }
            }
        }
    }

    public void moveFunc(int[] map, int x, int count) {
        int lcount, rcount;

        lcount = count + leftMove(map, x);
        rcount = count + leftMove(map, x);

        count = count + Integer.min(lcount, rcount);



    }

    public int leftMove(int[] map, int x) {


        int next = x-1;

        if(next < 0)
            next = N-1;

        if(map[next] != 0) {
            return 1 + leftMove(map, next);
        } else {
            return 1;
        }
    }

    public int rightMove(int[] map, int x) {

        int next = x+1;

        if(next >= N)
            next = N+1;

        if(map[next] != 0) {
            return 1+ rightMove(map, next);
        } else {
            return 1;
        }
    }

    public void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(x);


        while (!q.isEmpty()) {
            int temp = q.poll();

            for(int i=0; i<2; i++) {
                int next = temp + dx[i];

                if(next < 0)
                    next = N-1;
                if(next >= N)
                    next = 0;

                if(merry[next] == 0) {
                    if(merry[temp] > 1) {
                        return;
                    }
                }
            }
        }
    }

    public boolean isOne() {
        int a = 1;

        for(int i=0; i<N; i++) {
            a = a * merry[i];
        }

        return a==1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        merry = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            merry[i] = Integer.parseInt(st.nextToken());
        }


    }
}
