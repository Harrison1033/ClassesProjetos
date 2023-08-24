package teste;
//Main (Map)
public class Main {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3JjrxJl", new ClasseSeis("1984", "George Orwell",  19.60d));
        livrariaOnline.adicionarLivro("https://amzn.to/3PmYFnb", new ClasseSeis("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d ));
        livrariaOnline.adicionarLivro("https://amzn.to/43Sfzi0", new ClasseSeis("Assassinato no Expresso do Oriente", "Agatha Christie", 26.90d));
    }
}

