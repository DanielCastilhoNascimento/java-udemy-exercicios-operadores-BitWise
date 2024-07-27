import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        int mascaraParaConferirOSextoBit = 0b00100000;  //0b para declarar um numero binario
        //int mascaraParaConferirOSextoBit = 32; //Poderia ser um numero decimal com a sexta posição em 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero decimal para comparação do 6 bit : ");        
        int entradaUsuarioParaSeCompararOSextoBit = scanner.nextInt();

        if((entradaUsuarioParaSeCompararOSextoBit & entradaUsuarioParaSeCompararOSextoBit) != 0){
            System.out.println("O Sexto bit vale 1");
        }else{
            System.out.println("O Sexto bit vale 0");
        }

        /*  Conversões
         *  32 = 128 64 32 16 8 4 2 1
         *         0  0  1  0 0 0 0 0
         *  Entrada simulada
         *  40 = 128 64 32 16 8 4 2 1
         *         0  0  1  0 1 0 0 0
         */        
        scanner.close();
    }

}
