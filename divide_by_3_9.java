/**
 * Created by pc on 21.09.2016.
 */
public class divide_by_3_9 {

    public static void main(String[] args) {
        int x;
        for (x = 1; x <= 100; x++) {
            if (x % 3 == 0) System.out.println(x);

            int b;
            for (b = 1; b <= 100; b++) {
                if (b % 9 == 0) System.out.println(b);

            }
        }
    }
}

