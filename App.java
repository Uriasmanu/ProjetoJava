import java.util.Scanner;

public class SPCarProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do carro alugado: ");
        String modeloCarro = scanner.nextLine();

        System.out.print("Digite o valor da diária para locação: ");
        double valorDiaria = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de locação: ");
        int qtdDiasLocacao = scanner.nextInt();

        System.out.print("Digite a quantidade de Km percorridos: ");
        int qtdKmPercorridos = scanner.nextInt();

        double precoTotal = calcularPrecoTotal(valorDiaria, qtdDiasLocacao, qtdKmPercorridos);

        System.out.println("Modelo do carro: " + modeloCarro);
        System.out.println("Valor total a pagar: R$" + precoTotal);

        scanner.close();
    }

    public static double calcularPrecoTotal(double valorDiaria, int qtdDiasLocacao, int qtdKmPercorridos) {
        double precoDiarias = valorDiaria * qtdDiasLocacao;
        double precoKmRodado = 0.20 * qtdKmPercorridos;
        return precoDiarias + precoKmRodado;
    }
}
