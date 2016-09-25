/**
 * Created by pc on 21.09.2016.
 */
public class Asd {

    public static void sort(int[] a) {
        for (int i = 0; i <a.length/2 ; i++) {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
}
