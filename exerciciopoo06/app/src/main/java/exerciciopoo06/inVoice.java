package exerciciopoo06;

public class inVoice {

    private String codigoItem;
    private String descricaoItem;
    private int qtdItem;
    private float precoItem;

    public inVoice(String codigoItem, String descricaoItem, int qtdItem, float precoItem) {
        this.setCodigoItem(codigoItem);
        this.setDescricaoItem(descricaoItem);
        this.setQtdItem(qtdItem);
        this.setPrecoItem(precoItem);

    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        if (qtdItem < 1) {
            qtdItem = 0;
        }
        this.qtdItem = qtdItem;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
        if (precoItem < 1) {
            precoItem = 0.0f;
        }
    }

    public float GetInvoiceAmout() {
        return qtdItem * precoItem;
    }

}
