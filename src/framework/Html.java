package framework;
public abstract class Html {
    protected double tamanho;
    protected String cor;

    public Html(double tamanho){
        this.tamanho = tamanho;
    }
    
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }   
}
