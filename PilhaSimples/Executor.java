package PilhaSimples;

public class Executor {
    public static void main(String[] args){
        PilhaSimples pilhaSimples = new PilhaSimples(4);
        pilhaSimples.adicionarElemento(1);
        pilhaSimples.adicionarElemento(2);
        pilhaSimples.adicionarElemento(3);
        pilhaSimples.adicionarElemento(4);
        pilhaSimples.listarElementos();
        System.out.println("=================================");
        pilhaSimples.removerElemento();
        pilhaSimples.removerElemento();
        pilhaSimples.listarElementos();
        System.out.println("=================================");
        pilhaSimples.removerTodasOcorrencias(2);
        pilhaSimples.listarElementos();
        System.out.println("=================================");
        pilhaSimples.buscarElemento(1);
        System.out.println("=================================");
        pilhaSimples.adicionarElemento(2);
        pilhaSimples.adicionarElemento(3);
        pilhaSimples.adicionarElemento(4);
        pilhaSimples.listarElementos();
        System.out.println("=================================");
        System.out.println("Maior:" + pilhaSimples.encontrarMaior());
        System.out.println("Menor:" + pilhaSimples.encontrarMenor());
        System.out.println("Média:" + pilhaSimples.calcularMedia());
        System.out.println("Quantidade:" + pilhaSimples.quantidade());
        System.out.println("=================================");
        pilhaSimples.aumentarCapacidade(6);
        pilhaSimples.listarElementos();
        System.out.println("=================================");
        pilhaSimples.adicionarElemento(5);
        pilhaSimples.adicionarElemento(6);
        pilhaSimples.listarElementos();




    }
}

