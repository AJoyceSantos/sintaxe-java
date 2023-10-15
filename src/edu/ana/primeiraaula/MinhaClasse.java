package edu.ana.primeiraaula;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Ana";
        String segundoNome = "Joyce";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
}

}
