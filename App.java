import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String modelo;
        int dias;
        int km;
        int diarias = 30;
        double total;
        double taxaKm = 0.20;
       
        Scanner leitor = new Scanner(System.in);

System.out.println("Seja bem vindo(a) ao sistema da Loja  SPCar");

        System.out.println("Por gentileza digite o modelo do carro escolhido");
        modelo = leitor.next();


        System.out.println("Digite quantos dias você utilizou o " + modelo);
        dias = leitor.nextInt();


        System.out.println("Digite quantos km voce rodou com o " + modelo);
        km = leitor.nextInt();
        total = (dias * diarias) + (km * taxaKm);
        System.out.println("O valor a ser pago pelo aluguel do " + modelo + " é " + total);
         
    }
}
