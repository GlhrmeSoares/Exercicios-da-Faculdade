package listaDuplamenteEncadeada;

public class ListaDupla <T>{
    private NoListaDupla<T> primeiro;

    public ListaDupla(){
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro(){
        return this.primeiro;
    }

    public void inserir(T valor){
        NoListaDupla<T> novoP = new NoListaDupla<>();
        novoP.setProximo(primeiro);
        novoP.setInfo(valor);
        primeiro.setAnterior(novoP);
    }

    public NoListaDupla<T> buscar(T valor){
        NoListaDupla<T> p = this.primeiro;
        while(p!=null){
            if(p.getInfo().equals(valor)){
                return p;
            }else
                p=p.getProximo();
        }
        return null;
    }

    public void retirar(T valor){
        NoListaDupla<T> p = primeiro;
        NoListaDupla<T> anterior;
        NoListaDupla<T> proximo;

        while(p!=null){
            if(p.getInfo().equals(valor)){
                anterior = p.getAnterior();
                anterior.setProximo(p.getProximo());
                proximo = p.getProximo();
                proximo.setAnterior(anterior);
            }else
                p=p.getProximo();
        }
    }

    public void exibirOrdemInversa(){
        NoListaDupla<T> p = primeiro;
        NoListaDupla<T> anterior = new NoListaDupla<>();
        String exibir = "";

        while(p!=null){
            anterior = p;
            p = p.getProximo();
        }
        while(p!=null){
            exibir += anterior.getInfo() +";";
            anterior = anterior.getAnterior();
        }
        System.out.println(exibir);
    }

    public void liberar(){//todo
        NoListaDupla<T> p = primeiro;
        NoListaDupla<T> proximo;

        while(p!=null){
                p=p.getProximo();
                proximo = p.getProximo().getProximo();
                p.setAnterior(null);
                p.setProximo(null);
                p.setInfo(null);
                p=proximo;
            
        }
    }

    public String toString(){
        NoListaDupla<T> p = primeiro;
        String exibir = "";

        while(p!=null){
            exibir += p.getInfo() +";";
            p = p.getProximo();
        }
        return exibir;
    }

}
