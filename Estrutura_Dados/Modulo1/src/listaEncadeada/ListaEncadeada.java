package listaEncadeada;

import java.lang.IndexOutOfBoundsException;

public class ListaEncadeada <T>{
    private NoLista<T> primeiro;

    public ListaEncadeada(){
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro(){
        return this.primeiro;
    }

    public void inserir(T info){
        NoLista<T> noLista = new NoLista<T>();
        noLista.setInfo(info);
        noLista.setProximo(this.primeiro);
        this.primeiro = noLista;
    }

    public boolean estaVazia(){
        return this.primeiro == null;
    }

    public NoLista<T> buscar(T info){
        NoLista<T> p = this.primeiro;
        while(p != null){
            if(p.getInfo().equals(info)){//trabalhar nisso
                return p;
            }else{
                p=p.getProximo();
            }
        }
        return null;
    }

    public void retirar(T info){
        NoLista<T> anterior = null;
        NoLista<T> p = this.primeiro;
        while(p != null && (!p.getInfo().equals(info))){
            anterior = p;
            p=p.getProximo();
        }
        if(p!=null){
            if(p==primeiro)
                primeiro = primeiro.getProximo();//para caso o nó a ser eliminado está no primeiro nó
            else
                anterior.setProximo(p.getProximo()); // para os outros casos
        }
    }

    public int obterComprimento(){
        int countComp = 0;
        NoLista<T> p = this.primeiro;
        while(p != null){
            countComp++;
            p=p.getProximo();
        }
        return countComp;
    }

    public NoLista<T> obterNo(int idx){
        NoLista<T> p = this.primeiro;

        if(idx < 0){
            throw new IndexOutOfBoundsException();
        }
        while((p!=null)&& (idx>0)){
            idx--;
            p=p.getProximo();
        }

        if(p==null){
            throw new IndexOutOfBoundsException();
        }
        return p;
    
    }
}
