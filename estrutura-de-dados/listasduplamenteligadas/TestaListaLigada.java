package listasduplamenteligadas;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("cecilia");
        System.out.println(lista);
        lista.adicionaNoComeco("jose");
        System.out.println(lista);
        lista.adicionaNoComeco("joao");
        System.out.println(lista);

        lista.adiciona("marcelo");
        System.out.println(lista);

        lista.adiciona(2, "gabriel");
        System.out.println(lista);

        Object x = lista.pega(2);
        System.out.println(x);

        System.out.println(lista.tamanho());

        lista.removeDoComeco();
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("danilo"));
    }
}