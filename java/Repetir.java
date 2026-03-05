public class Repetir{
    public static void main(String[] args){
        int i = 0;
        /* while(i < 11){
            System.out.println(i);
            i = i + 1;        
        } 
        do {
            System.out.println(i--);
        }while(i > -1); */
        for(int j = 100; j < 106; j++){
            System.out.println( j  + " ");
        }
        for(String x: args){
            System.out.println(x);
        }    
    }
}
