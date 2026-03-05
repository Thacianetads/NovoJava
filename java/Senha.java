public class Senha{
    public static void main(String[] args){
        String a, b;
        a = "aa";
        b = "bb";
        /*if(a == b){
            System.out.println("Correto!");
        }
        else{
            System.out.println("Errado!");
        } */

        if(args[0].equals("swordfish")){
            System.out.println("Senha correta!");
        }
        else{
            System.out.println("Senha incorreta!");
        }
    }
}
