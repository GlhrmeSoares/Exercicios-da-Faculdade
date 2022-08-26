package listaEstatica;

public class app {
    public static void main(String[] args) {
        ListaEstatica<Integer> idades;
        idades = new ListaEstatica<>();

        idades.inserir(20);
        idades.inserir(0);
        idades.inserir(80);
        idades.inserir(44);

        for(int i = 0; i<idades.getTamanho();i++)
            System.out.println(idades.obterElemento(i));
        }
    }