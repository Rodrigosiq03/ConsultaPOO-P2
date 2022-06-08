public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
    
    @Override
    public void fazBarulho() {
    System.out.println("miau");
    }
    @Override
    public String toString() {
        return "cachorrinho" + super.toString();
    }
}
    

