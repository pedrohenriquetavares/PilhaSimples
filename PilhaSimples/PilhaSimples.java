package PilhaSimples;
public class PilhaSimples {
    private int tamanho;
    private Integer lista[]; //Um array que armazena os elementos da pilha.
    private int topo;

    public PilhaSimples(Integer tamanho) {
        this.tamanho = tamanho;
        this.lista = new Integer[this.tamanho];
        this.topo = -1;
        System.out.println("A pilha simples foi criada.");
    }

    public boolean vazio() {
        return topo == -1;
    }

    public boolean cheio() {
        return topo == lista.length - 1;
    }

    public void listarElementos() {
        for (int i = 0; i < this.tamanho ; i++) {  //o loop percorre todos os elementos presentes na pilha
            System.out.println(lista[i]);
        }
    }

    public void adicionarElemento(Integer elemento) {
        if (cheio()) {
            System.out.println("A pilha está cheia!");
            return;
        }
        topo = topo + 1;
        lista[topo] = elemento;
    }

    public void removerElemento(){
        if(vazio()){
            System.out.println("Nao ha nanhum elemento para a remocao.");
        }else{
            lista[topo] = null;
            topo = topo - 1;
        }
    }

    public boolean buscarElemento(Integer elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(lista[i] == elemento) {
                System.out.println("O elemento " + elemento + " está presente na lista.");
                return true;
            }
        }
        System.out.println("O elemento " + elemento + " não está presente na lista.");
        return false;
    }

    public void aumentarCapacidade(Integer novoTamanho) { //estudar mais!!!
        int novaCapacidade = novoTamanho;
        Integer novaLista[] = new Integer[novaCapacidade];
        for (int i = 0; i <= topo; i++) {
            novaLista[i] = lista[i];
        }
        lista = novaLista;
        tamanho = novaCapacidade;
    }

    public void removerTodasOcorrencias(Integer elemento) {
        if (vazio()) {
            System.out.println("A pilha está vazia, nada a remover.");
            return;
        }


        Integer[] novaLista = new Integer[tamanho];
        int novoTopo = -1;

        for (int i = 0; i <= topo; i++) {
            if (!lista[i].equals(elemento)) { //Para cada elemento que não é igual ao elemento a ser removido
                novoTopo++;
                novaLista[novoTopo] = lista[i];
            }
        }

        lista = novaLista; //contém apenas os elementos que não foram removidos
        topo = novoTopo;
        System.out.println("Todas as ocorrências do elemento " + elemento + " foram removidas.");

    }
    public int quantidade() {
        return topo + 1;
    }

    public double calcularMedia() {
        if (vazio()) {
            System.out.println("A pilha está vazia, não é possível calcular a média.");
            return 0;
        }

        double soma = 0;            //inicializa duas variaveis,p fazer soma e contar n de elementos
        int quantidade = 0;

        for (int i = 0; i <= topo; i++) {
            soma += lista[i];
            quantidade++;
        }

        return soma / quantidade;
    }

    public int encontrarMaior() {
        if (vazio()) {
            System.out.println("A pilha está vazia, não é possível encontrar o maior elemento.");
            return 0;
        }

        int maior = lista[0];
        for (int i = 1; i <= topo; i++) {
            if (lista[i] > maior) { //compara o elemento atual com o maior elemento encontrado até agora.
                maior = lista[i];
            }
        }
        return maior;
    }

    public int encontrarMenor() {
        if (vazio()) {
            System.out.println("A pilha está vazia, não é possível encontrar o menor elemento.");
            return 0;
        }

        int menor = lista[0];
        for (int i = 1; i <= topo; i++) { //loop for que começa no segundo elemento (índice 1) até o topo
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }
        return menor;
    }
}
