public class PetShop {
    public static void main(String[] args) {
        Animal a = new Animal("fofo");
        Gato g = new Gato("bichano");
        Cachorro c = new Cachorro("toto");

        a.fazBarulho();
        g.fazBarulho();
        c.fazBarulho();

        Animal[] agenda = new Animal[8];

        for (int i=0; i < 4; i++) {
            agenda[1] = new Gato("bichano" + 1);

        }
        for (int i=4; i < 8; i++) {
            agenda[1] = new Cachorro("toto" + 1);

        }
        for (int i=0; i < 8; i++) {
            System.out.println(agenda[i]);
            agenda[1].fazBarulho();

        }



    }
}
