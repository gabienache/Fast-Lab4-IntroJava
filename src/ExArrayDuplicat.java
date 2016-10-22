/**
 * Created by genache on 10/22/2016.
 */
public class ExArrayDuplicat {
    public static void main(String[] args) {
        int[] sir={5,6,71,8,9};
        int[] sirduplicat=new int[5];
        int numar=0;
        for(int i=0;i<sir.length;i++){
            numar=sir[i];
            sirduplicat[i]=numar;
            //System.out.println("sirduplicat: " + sirduplicat[i]);
        }
        for(int i=0;i<sirduplicat.length;i++){
            numar=sir[i];
            sirduplicat[i]=numar;
            System.out.println("sirduplicat: " + sirduplicat[i]);
        }
    }
}
