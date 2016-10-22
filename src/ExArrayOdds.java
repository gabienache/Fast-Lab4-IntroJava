/**
 * Created by genache on 10/22/2016.
 */
public class ExArrayOdds {
    public static void main(String[] args) {
        int[] sir={5,6,71,8,9};
        int numar=0;
        for(int i=0;i<sir.length;i++){
            //System.out.println(sir[i]);
            numar=sir[i];
            int EsteImpar=numar%2;
//            System.out.println("modulo este: "+EsteImpar);
            if(EsteImpar==0){
                System.out.println("numarul "+sir[i]+" este par");
            }
//            sum=sum+sir[i];
//            if(sir[i]>max){
//                max=sir[i];
//            }
        }
        //avg=sum/(double)sir.length;
        //System.out.println("max: "+max);
        //System.out.println("avg este: "+avg);
        //System.out.println("max: "+max);
    }
}
