import java.util.*;

public class AL_25642 {
    public static <or> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yt = sc.nextInt();

        int yj = sc.nextInt();

        String ans = "";

        while (true) {
            yj = yj + yt;
            if(yj > 4) {
                ans = "yt";
                break;
            }
            yt = yt + yj;
            if(yt > 4) {
                ans = "yj";
                break;
            }
        }

        System.out.println(ans);
    }
}
