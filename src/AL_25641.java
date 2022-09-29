import java.util.*;

public class AL_25641 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int s = 0, t = 0;

        String stst = sc.next();

        String ans = "";

        String ans2 = "";

        for(int i =count-1; i >= 0; i--) {
            if(stst.charAt(i) == 's') {
                s++;
            } else {
                t++;
            }
            ans = Character.toString(stst.charAt(i)).concat(ans);
            if(s == t) {
                ans2 = ans;
            }
        }
        System.out.println(ans2);
    }
}
