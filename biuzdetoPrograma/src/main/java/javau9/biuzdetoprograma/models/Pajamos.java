package javau9.biuzdetoprograma.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pajamos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double suma;
    String data;
    String kategorija;
    String paskirtis;
    public Pajamos(){}

    public Pajamos(Double suma, String data, String kategorija, String paskirtis) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.paskirtis = paskirtis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getPaskirtis() {
        return paskirtis;
    }

    public void setPaskirtis(String paskirtis) {
        this.paskirtis = paskirtis;
    }

    @Override
    public String toString() {
        return "Pajamos{" +
                "id=" + id +
                ", suma=" + suma +
                ", data='" + data + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", paskirtis='" + paskirtis + '\'' +
                '}';
    }
}
