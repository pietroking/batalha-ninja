public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja){
        int i;
        for (i=0; i<3; i++){
            primeiroNinja.atacar(segundoNinja);
            segundoNinja.atacar(primeiroNinja);
        }
        if (segundoNinja.nome.equals("Itachi")){
            return segundoNinja;
        }else if((primeiroNinja.chakra >= segundoNinja.chakra)|| primeiroNinja.nome.equals("Itachi")){
            return primeiroNinja;
        }else return segundoNinja;
    }
}
