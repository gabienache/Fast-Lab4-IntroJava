/**
 * Created by genache on 10/22/2016.
 */
public class ExArray {
    public static void main(String[] args) {
        int[] sir={-5,-6,-71,-8,-9};
        double avg;double sum=0;
        int max=sir[0];
        for(int i=0;i<sir.length;i++){
            System.out.println(sir[i]);
            sum=sum+sir[i];
            if(sir[i]>max){
                max=sir[i];
            }
        }
        avg=sum/(double)sir.length;
        System.out.println("max: "+max);
        System.out.println("avg este: "+avg);
        //System.out.println("max: "+max);
    }
}
