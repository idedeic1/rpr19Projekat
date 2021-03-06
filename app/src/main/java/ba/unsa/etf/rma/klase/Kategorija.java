package ba.unsa.etf.rma.klase;


import java.io.Serializable;

public class Kategorija implements Serializable {
    private String naziv;
    private String id;

    public Kategorija(){}

    public Kategorija(String naziv, String id) {
        this.naziv = naziv;
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return this.getNaziv();
    }

    @Override
    public boolean equals(Object o){
        Kategorija k = (Kategorija)o;
        if(this.getNaziv().equals(k.getNaziv()) && this.getId().equals(k.getId())) return true;
        return false;
    }
}
