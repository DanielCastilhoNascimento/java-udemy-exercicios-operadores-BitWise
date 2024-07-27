public class Exemplo01 {
    public static void main(String[] args) {

        int numero1 = 89;
        int numero2 = 60;

        System.out.println(numero1 & numero2); 
        //saida igual 24. Compara os numeros em binario um a um. 
        //89 = 0011 1100  60 = 0101 1001
        //0 & 0 = 0 (F & F = F); ...
        System.out.println(numero1 | numero2);
        System.out.println(numero1 ^ numero2);
        System.out.println("===========");
        
    }

}
