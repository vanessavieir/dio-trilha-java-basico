public class OrdemInversa {
    public static void main(String[] args) {
        
        int [] vetor= {2,4,-6,79,4,5};
        System.out.println("Vetor:");
        //int count=0;
        // while(count < vetor.length){
        //     System.out.print(vetor[count]+ " ");
        // count+=1;
        // }

        for(int i=vetor.length-1; i>=0; i--){
            System.out.print(vetor[i]+" ");
        }

    }
}
