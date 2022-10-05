import java.util.*;

public class AL_25633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] domino = new int[count];

        for(int i=0; i<count; i++) {
            domino[i] = sc.nextInt();
        }

        int ans = 0;

        ans = dominocalc(domino);

        System.out.println(ans);
    }

    static int dominocalc(int[] domino) {

        int ans = 1;

        int sum = 0;

        for(int i = 0; i<domino.length-1; i++) {
            sum = sum + domino[i];

            if(sum < domino[i+1]) {
                sum = 0;
                ans = 1;
            } else {
                ans++;
            }
        }

        return ans;
    }
}
