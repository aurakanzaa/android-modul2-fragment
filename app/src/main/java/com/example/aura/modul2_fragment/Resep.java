package com.example.aura.modul2_fragment;

public class Resep {

    private String nama_makanan;
    private String deskripsi;

    public static final Resep[] resepmakanan={
            new Resep("Cilok", "tepung, terasi, air" ),
            new Resep("Batagor", "tepung, kacang, daging" ),
            new Resep("Bakwan", "tepung, jagung, air" ),
    };

    public Resep(String name, String description) {
        this.nama_makanan = name;
        this.deskripsi = description;
    }

    public String getName() {
        return nama_makanan;
    }

    public String getDescription() {
        return deskripsi;
    }

    public String toString() {
        return this.nama_makanan;
    }
}
