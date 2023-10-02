import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (parametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws parametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new parametrosInvalidosException();
        }

        for (int contador = parametroUm; contador <= parametroDois; contador++) {
            System.out.println(contador);
        }
    }
}

class parametrosInvalidosException extends Exception {
	
}
