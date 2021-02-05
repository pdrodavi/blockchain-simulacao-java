package br.com.pedrodavi.blockchain;

import java.util.ArrayList;

public class Application {

    /** Aqui é feito a simulação do bloco Gênesis, que seria o primeiro bloco
     * na cadeia, o código abaixo simula a codificação permanente das transações
     * que ocorrem e os valores das hashs anteriores. */

    ArrayList<Block> blockchain = new ArrayList<>();

    /** Para efeitos de teste e mostrar na prática você pode exeuctar o código
     * e depois alterar o hash do bloco Gênesis que as saídas serão completamente
     * diferentes, como foi feito pra ser imutável, por mais que sofra alteração
     * ele não permanecerá mais com a mesma hash, assim pode-se afirmar que
     * o dado ou transação sofreu alguma alteração ou perca de integridade.
     * É assim que o sistema do Blockchain funciona, a cada cadeia de bloco formada
     * o hash do novo bloco aponta para o hash do bloco que veio antes dele.
     * Assim o sistema garante ser a prova de adulterações, pois se quaisquer parte
     * de uma transação mudar a hash muda completamente, assim ocorre com os hashs
     * do bloco a qual a transação pertecence e com o hashes do bloco posterior.
     * Resultando numa fácil detecção de qualquer violação como resultado, pois
     * você pode simplesmente realizar a comparação de hashs. */

    public static void main(String[] args) {

        String[] genesisTransactions = {"Suraj sent Ruja 1542 Bitcoins", "Ruja sent 10 Bitcoins to John"};
        Block genesisBlock = new Block(0, genesisTransactions);
        System.out.println("Genesis Block Hash:" + genesisBlock.getBlockHash());

        String[] block2Transactions = {"John sent 10 bitcoins to Suraj", "Suraj sent 10 bitcoins to Alex"};
        Block block2= new Block(genesisBlock.getBlockHash(), block2Transactions);
        System.out.println("Block2 Hash:" + block2.getBlockHash());

        String[] block3Transactions = {"Alex sent 999 bitcoins to non"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        System.out.println("Block3 Hash:" + block3.getBlockHash());

    }

}
