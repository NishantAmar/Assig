import java.util.*;

public class Assignment {
    public static void main(String st[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        String ptr, str;
        System.out.print("Enter how many test cases : ");
        T = sc.nextInt();
        boolean bool[] = new boolean[T];
        boolean hold = true;

        // Getting input
        for (int i = 0; i < T; i++) {
            System.out.print("Enter patter and string : ");
            ptr = sc.next();
            str = sc.next();
            for (int j = 0; j < ptr.length(); j++) {
                for (int p = 0; p < str.length(); p++) {
                    if (ptr.charAt(j) == str.charAt(p)) {
                        hold = true;
                        break;
                    } else {
                        hold = false;
                    }
                }
                if (hold == false) {
                    bool[i] = false;
                    break;
                }
            }
            if (hold == true) {
                bool[i] = true;
            }
        }

        for (int x = 0; x < bool.length; x++) {
            if (bool[x]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}