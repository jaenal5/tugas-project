package model;

public class Anggota {

    private int idAnggota;
    private String nim;
    private String nama;
    private String jurusan;
    private String noHp;
    private String alamat;

    public Anggota() {
    }

    public Anggota(int idAnggota, String nim, String nama,
                   String jurusan, String noHp, String alamat) {

        this.idAnggota = idAnggota;
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}