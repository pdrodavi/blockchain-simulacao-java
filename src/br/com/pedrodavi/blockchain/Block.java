package br.com.pedrodavi.blockchain;

import java.util.Arrays;

public class Block {

    /** Classe que simula o comportamento de um bloco da cadeia do Blockchain,
     * mesmo com uma abordagem simulada prova-se através de um código simples
     * que após uma transação ser gravada na cadeia, ou seja, a partir do
     * momento que a hash é gerada ela se torna impossível de mudar ou
     * sofrer quaisquer perca de integridade dos dados. As transações do
     * Blockchain foram feitas para ser imutáveis. */

    private int previousHash;
    private String[] transactions;
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        Object[] contents = {Arrays.hashCode(transactions),previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }
}
