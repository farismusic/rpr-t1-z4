package ba.unsa.etf.rpr.predavanje03;

public class Predmet {
    private Student[] nizStudenata = new Student[50];
    private String nazivPredmeta;
    private int sifraPredmeta;
    private static int trenutno = 0;
    private static int maxStudenata;

    public void upisi(Student s) {
        getNizStudenata()[trenutno++] = s;
    }

    public void ispisi(Student s) {
        System.out.println(s.getPrezime() + " " + s.getIme() + "(" + s.getBrojIndeksa() + ")");
    }

    public void ispisiSve() {
        for (int i = 0; i < trenutno; i++) {
            System.out.print(i + 1 + ". ");
            this.ispisi(getNizStudenata()[i]);
        }
    }

    public Student[] getNizStudenata() {
        return nizStudenata;
    }

    public void setNizStudenata(Student[] nizStudenata) {
        this.nizStudenata = nizStudenata;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
}