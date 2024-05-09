import javax.swing.JOptionPane;

public class GeradorDeSenhas {

    public static void main(String[] args) {
        /*Gerar Senha no Console
        System.out.println("Sua senha: " + gerarSenha()); */
        JOptionPane.showMessageDialog(null, "Sua senha é: "  + gerarSenha(),
          "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String gerarSenha() {
        //int Numero Maximo de Caracteres = 8;
        int qtdeMaximaCaracteres = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da sua senha: "));
        String[] caracteres = {"0", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z", "+", "-", "/", "*", "_", "!", "@", "$", "%", "&"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
    }
}