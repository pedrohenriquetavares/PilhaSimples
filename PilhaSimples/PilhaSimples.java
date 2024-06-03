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
        return topo == lista.length - 1;   //Esta comparação verifica se topo está no índice máximo do array

    }

    public void listarElementos() {
        for (int i = 0; i < this.tamanho ; i++) {
            System.out.println(lista[i]);
        }
    }

    public void adicionarElemento(Integer elemento) {
        if (cheio()) {
            System.out.println("A pilha está cheia!");
            return;
        }
        topo = topo + 1;          // Incrementa o índice do topo para apontar para o novo topo
        lista[topo] = elemento;   // Adiciona o elemento na posição do novo topo
    }

    public void removerElemento(){
        if(vazio()){
            System.out.println("Nao ha nanhum elemento para a remocao.");
        }else{
            lista[topo] = null;   //o topo é definido como null,efetivamente removendo o elemento.
            topo = topo - 1;      //movendo o topo da pilha para o elemento abaixo.
        }
    }

    public boolean buscarElemento(Integer elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(lista[i] == elemento) {           //verifica se o elemento da lista é igual o pedido
                System.out.println("O elemento " + elemento + " está presente na lista.");
                return true;
            }
        }
        System.out.println("O elemento " + elemento + " não está presente na lista.");
        return false;
    }

    public void aumentarCapacidade(Integer novoTamanho) {
        int novaCapacidade = novoTamanho;   //serve para converter o tipo Integer para int.
        Integer novaLista[] = new Integer[novaCapacidade]; //cria nova lista c+ uma nova capacidade
        for (int i = 0; i <= topo; i++) {
            novaLista[i] = lista[i];       //copia os elementos para a nova lista
        }
        lista = novaLista;  //atualiza para nova lista
        tamanho = novaCapacidade;  //novo tamanho=capacidade da nova lista
    }

    public void removerTodasOcorrencias(Integer elemento) {
        if (vazio()) {
            System.out.println("A pilha está vazia, nada a remover.");
            return;
        }

        // Recria a pilha com os elementos que nao foram removidos e indica novo topo
        Integer[] novaLista = new Integer[tamanho];
        int novoTopo = -1;

        for (int i = 0; i <= topo; i++) { //o loop percorre todos os elementos presentes na pilha até o topo
            if (!lista[i].equals(elemento)) { //Verifica se o elemento atual não é igual ao elemento a ser removido.
                novoTopo++;       //novoTopo é incrementado
                novaLista[novoTopo] = lista[i];  //O elemento é copiado para a nova pilha na posição novoTopo
            }
        }

        lista = novaLista;   //contém apenas os elementos que não foram removidos
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
            soma += lista[i];     //cada elemento verificado é adicionado a soma
            quantidade++;        //percorrendo e contando a quantidade de elementos
        }

        return soma / quantidade;
    }

    public int encontrarMaior() {
        if (vazio()) {
            System.out.println("A pilha está vazia, não é possível encontrar o maior elemento.");
            return 0;
        }

        int maior = lista[0];
        for (int i = 1; i <= topo; i++) { //loop for que começa no segundo elemento até o topo
            if (lista[i] > maior) {   //compara o elemento atual com o maior elemento encontrado até agora.
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

        int menor = lista[0];  //Assume que o primeiro elemento da pilha é o menor.
        for (int i = 1; i <= topo; i++) {
            if (lista[i] < menor) {
                menor = lista[i]; //atualializa o menor elemento da lista
            }
        }
        return menor;
    }
}
