public class Aula3{
    public static void main(String[] args) {
       
        int nota = 100;
        int media = 70;
        int falta = 21;
        int maxfalta = 20;
 
         if((nota >= media) && (falta <= maxfalta)){
             System.out.println("Parabens, voce esta aprovado!");
         } else if((nota >= 55) && (falta <= maxfalta)){
             System.out.println("Infelizmente voce esta em recuperacao!");
         } else if((nota > 55) && (falta <= maxfalta)){
             System.out.println("Voce foi reprovado por nota!!");
         } else if((nota >= media) && (falta > maxfalta)){
             System.out.println("Voce reprovou por falta!!");
         } else if((nota >= 55) && (falta > maxfalta)){
            System.out.println("Infelizmente voce esta reprovado por falta!");
         } else {
             System.out.println("Fim do Programa!");
         }
    }
}