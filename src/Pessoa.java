public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Maquina m = new Maquina("xpto");
        m.getMarca();
        m.setMarca("teset");
    }

}
