public class tabelaVerdade {
    public static void main(String[] args){
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        String mensagemFDS = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagemFDS);

        String mensagemFS = fazendoSol ? "Está fazendo sol" : "Não está fazendo sol";
        System.out.println(mensagemFS);


    }
}
