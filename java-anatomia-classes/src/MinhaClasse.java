public class MinhaClasse {

public static void main (String [] args) {

    String primeiroNome = "Aline";
    String segundoNome = "Candido";

    String nomeComplete = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeComplete);
    
}   

public static String nomeCompleto (String primeiroNome, String segundoNome){

    return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
