package estudando.classe1;

public class Main  {
    public static void main(String[] args){
       String nome = " Harrison ";
       String numero = "012345";
        System.out.println(nome.charAt(3));//mostra a letra da palavra no endereço solicitado
        System.out.println(nome.length());//Mostra o tamanho da string
        System.out.println(nome.replace("r","l"));//Troca o 'r' pelo 'l' (só para exibição)
        System.out.println(nome.toLowerCase());//Coloca toda string em caixa baixa
        System.out.println(nome.toUpperCase());//Coloca toda string em caixa alta
        System.out.println(nome.trim());//remove os espaços em branco antes e depois das strings

        System.out.println(numero.length());
        System.out.println(numero.substring(0,3));//Mostra as strings da posição 0 à 2
        System.out.println(numero.substring(1));//Mostra a string da posição 1 até a ultima
        System.out.println(numero.substring(1,numero.length()));//faz o mesmo que o código a cima

    }
}