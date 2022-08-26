package listaEncadeada;

public class NoLista <T>{
   private T info;
   private NoLista<T> proximo;

   public void setInfo(T i){
    this.info = i;
   }
   
   public void setProximo(NoLista<T> p){
    this.proximo = p;
   }

   public T getInfo(){
    return this.info;
   }
   
   public NoLista<T> getProximo(){
    return this.proximo;
   }
}
