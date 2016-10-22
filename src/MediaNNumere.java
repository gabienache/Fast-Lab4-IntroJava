/**
 * Created by genache on 10/22/2016.
 */
public class MediaNNumere {
    public static void main(String[] args) {
        Double Numar;
        double Suma=0;
        int x=0;
        do
        {
            Numar = (double)SkeletonJava.readIntGUI("introdu numar: " );
            if (Numar>0) {
                Suma = Suma + Numar;
                x++;
            }
            //System.out.println("suma:"+Suma);
        }while(Numar>0);
        double Media=Suma/x;
        System.out.println("suma: "+Suma);
        System.out.println("x: "+x);
        System.out.println("Media este:"+Media);
    }
}
