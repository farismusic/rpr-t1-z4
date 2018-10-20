package ba.unsa.etf.rpr.predavanje03;

public class Program {

    public static void main(String[] args) {
        Predmet matematika = new Predmet();
        Student s1 = new Student("Faris", "Music", 18296);
        matematika.upisi(s1);
        Student s2 = new Student("Sulejman", "Tutnjevic", 18290);
        matematika.upisi(s2);
        Student s3 = new Student("Haris", "Hodzic", 12345);
        matematika.upisi(s3);
        Student s4 = new Student("Esad", "Salihagic", 11111);
        matematika.upisi(s4);
        matematika.ispisiSve();
        matematika.setNazivPredmeta("Matematika");
        System.out.println("Ime predmeta: "+ matematika.getNazivPredmeta());
    }
}
