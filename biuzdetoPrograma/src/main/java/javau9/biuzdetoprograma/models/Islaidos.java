package javau9.biuzdetoprograma.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Islaidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double suma;
    String data;
    String kategorija;
    String atsiskaitymoBudas;

    public Islaidos() {}

    public Islaidos(Double suma, String data, String kategorija, String atsiskaitymoBudas) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
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

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    @Override
    public String toString() {
        return "Islaidos{" +
                "id=" + id +
                ", suma=" + suma +
                ", data='" + data + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", atsiskaitymoBudas='" + atsiskaitymoBudas + '\'' +
                '}';
    }
}
