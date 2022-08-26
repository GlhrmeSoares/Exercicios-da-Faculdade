package listaEstatica;
public class ListaEstatica <t>{

    private t[] info;
    private int tamanho;

    public ListaEstatica(){
        tamanho = 0;
        info = (t[]) new Object[10];
    }

    private void redimensionar(){
       t[] infoNew = (t[]) new Object[info.length + 10];
        for(int i=0;i<info.length;i++){  
            infoNew[i] = this.info[i];
        }
        info = infoNew;
    }

    public void inserir(t valor){
        if(info.length == tamanho){
            redimensionar();
        }
            info[tamanho] = valor;
            tamanho++;
    }

    public void exibir(){
        for(int i=0;i<tamanho;i++){
            System.out.println(info[i]);
        }
        
    }

    public int buscar(t valor){
        for(int i = 0; i< tamanho; i++){
            if(info[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public void retirar(t valor){ 
        int posicao = buscar(valor);
        if(posicao > -1){
                for(int j = posicao+1; j<tamanho;j++){
                    info[j-1] = info[j];
                }
                tamanho--;
            }

            info[tamanho] = null;
    }

    public void liberar(){
        this.info= (t[]) new Object[10];
        this.tamanho = 0;
    }

    public t obterElemento(int posicao){
        if(posicao>=0 && (posicao<tamanho)){
            return info[posicao];
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public String toString(){
        String val = "";
        for(int i = 0; i <= tamanho; i++){
            if(i==tamanho){
                val += info[i] +"";
            }else{
                val += info[i] +",";
            }
        }
        return val;
    }

    public void inverter(){
        t bolha;
        int direita=tamanho-1;

        for(int i=0;i<=tamanho/2;i++){
            bolha = info[i];
            info[i] = info[direita];
            info[direita] = bolha;

            direita--; 
        }
    }

    public static void main(String[] args) {
        
    }
}
