import java.util.*;

public class AL_25644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] ju = new int[count];

        for(int i=0; i<count; i++) {
            ju[i] = sc.nextInt();
        }

        int minus = 0;

        int ans = 0;

        for(int i=0; i<count; i++) {
            for(int j=i; j<count; j++) {
                minus = ju[j] - ju[i];
                if(minus > ans) {
                    ans = minus;
                }
            }
        }

        System.out.println(ans);
    }
}
