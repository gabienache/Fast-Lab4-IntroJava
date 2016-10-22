/**
 * Created by genache on 10/22/2016.
 */
public class exercitii {
    public static void main(String[] args) {
        double numar=0;
        double a;
        int max=SkeletonJava.readIntGUI("cate vrei: ");
        int x=0;
        for(x=0;x<max;x++) {
            a = (double)SkeletonJava.readIntGUI("introdu numar: " + x);
            numar=numar+a;
        }
        System.out.println("x: "+x);
        double media=numar/max;
        //int b=SkeletonJava.readIntGUI("introdu al doilea numar:");
        //double avg=(a+b)/2.0;
        SkeletonJava.printGUI("media este : "+media);
    }
}
