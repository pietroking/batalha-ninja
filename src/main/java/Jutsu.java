public class Jutsu {

    private int chakraJutso;
    private int danoJutsu;

    public int getDanoJutsu() {
        return danoJutsu;
    }
    public int getChakraJutsu() {
        return chakraJutso;
    }

    public Jutsu(int chakra, int dano) {
        if(chakra <= 5){
        this.chakraJutso = chakra;
        }else {
            this.chakraJutso = 5;
        }

        if (dano <= 10){
        this.danoJutsu = dano;
        }else {
            this.danoJutsu = 10;
        }
    }


}
