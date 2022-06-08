public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public void fazBarulho() {
        System.out.println("au au");
    }
    @Override
    public String toString() {
        return "cachorrinho" + super.toString();
    }
}
