public class Condicionais{
    public static void main(String[] args){
            int a,b;
            a = 20;
            b = 10;
            if(a < b){
                System.out.println("A: " + a);
            } 
            else if(a == b){
                System.out.println("A e B: " + a + " " + b);
            }
            else {
                System.out.println("B: " + b);
                System.out.println("Acerto!");                    
            }
            switch(a){
                case 10:
                    System.out.println("Valor: 10");
                    break;
                case 20:
                    System.out.println("Valor: 20");
            }    
    }
}
