public class Ninja {
    String nome;
    int chakra;
    Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.chakra = 100;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void receberGolpe(int danoJutsu){
        this.chakra = this.chakra - danoJutsu;
    }

    public void atacar(Ninja oponente){
        oponente.receberGolpe(this.jutsuPrincipal.getDanoJutsu());
        this.chakra = this.chakra - this.jutsuPrincipal.getChakraJutsu();

    }

    public int getChakra() {
        return this.chakra;
    }

}
