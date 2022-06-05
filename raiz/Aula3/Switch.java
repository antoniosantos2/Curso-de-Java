public class Switch{
    public static void main(String[] args) {

        int col = 8;

        switch (col){
            case 1:
                System.out.println("Voce ficou em primeiro lugar!!");
                break;
            case 2:
                System.out.println("Voce ficou em segundo lugar!!");
                break;
            case 3:
                System.out.println("Voce esta em terceiro lugar!!");
                break;
            case 4:
                System.out.println("Voce esta em quarto lugar!!");
                break;
            case 5:
                System.out.println("Voce esta em quinto lugar!!");
                break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Voce nao ficou no podio, mas recebera um premio de consolacao!!");
                break;
            default:
                System.out.println("Voce nao ocupa posicao no podio!!");
                break;
        }
        
    }
}