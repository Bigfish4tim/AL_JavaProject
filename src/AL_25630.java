import java.util.*;

public class AL_25630 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        String stst = sc.next();

        int ans = 0;

        for(int i = 0; i < count/2; i++) {
            if(stst.charAt(i) != stst.charAt(count-i-1)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
