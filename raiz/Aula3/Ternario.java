public class Ternario{
    public static void main(String[] args){

        int nota = 110;
        int media = 70;
        int falta = 29;
        int maxfalta = 20;
        String res;

        res=((nota >= media && falta <= maxfalta)? "Aprovado!" :(nota >= 55 && falta <= maxfalta)?
        "Recuperação": (nota < 55 && falta <= maxfalta)? "Reprovado!": "Reprovado por falta!" );
        System.out.println("Resultado: " + res);


    }
}