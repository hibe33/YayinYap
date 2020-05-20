package goruntu;
public class Goruntu {}

interface Cihaz {
    public void ac();
    public void kapat();
    public void goster();
    public void goster(String yazi);
}

class TV implements Cihaz{
    int buyukluk;
    int yayinYili;
    int renkSayisi;
    private String uretenFirma;
    
    public TV() {
    }
    private void setUretenFirma(String s){
        uretenFirma = s;
    }
    public String getUretenFirma(){
        return uretenFirma;
    }
    public TV(int buyukluk, int yayinYili, int renkSayisi, String uretenFirma) {
        this.buyukluk = buyukluk;
        this.yayinYili = yayinYili;
        this.renkSayisi = renkSayisi;
        this.uretenFirma = uretenFirma;
    }
    
    public TV(int buyukluk, int yayinYili, int renkSayisi) {
        this.buyukluk = buyukluk;
        this.yayinYili = yayinYili;
        this.renkSayisi = renkSayisi;
    }
    
    @Override
    public void ac() {
        System.out.println("TV Acildi");
    }
    @Override
    public void kapat() {
        System.out.println("TV Kapandi");
    }
    @Override
    public void goster(String yazi) {
        System.out.println("TV gosteriyor" + yazi);
    }
    @Override
    public void goster() {
        System.out.println("TV gosteriyor" + " Her hangi birsey Girilmedi");
    }
}

class LCD implements Cihaz{
    int buyukluk;
    int yayinYili;
    int renkSayisi;
    private String uretenFirma;

    public LCD() {
    }

    public LCD(int buyukluk, int yayinYili, int renkSayisi, String uretenFirma) {
        this.buyukluk = buyukluk;
        this.yayinYili = yayinYili;
        this.renkSayisi = renkSayisi;
        this.uretenFirma = uretenFirma;
    }
    
    public LCD(int buyukluk, int yayinYili, int renkSayisi) {
        this.buyukluk = buyukluk;
        this.yayinYili = yayinYili;
        this.renkSayisi = renkSayisi;
    }
    private void setUretenFirma(String s){
        uretenFirma = s;
    }
    public String getUretenFirma(){
        return uretenFirma;
    }
    @Override
    public void ac() {
        System.out.println("LCD Acildi");
    }
    @Override
    public void kapat() {
        System.out.println("LCD Kapandi");
    }
    @Override
    public void goster(String yazi) {
        System.out.println("LCD gosteriyor" + yazi);
    }
    @Override
    public void goster() {
        System.out.println("LCD gosteriyor" + " Her hangi birsey Girilmedi");
    }
}

class Projector implements Cihaz{
    int buyukluk;
    int yayinYili;
    int renkSayisi;
    private String uretenFirma;

    public Projector() {
    }

    public Projector(int buyukluk, int yayinYili, int renkSayisi, String uretenFirma) {
        this.buyukluk = buyukluk;
        this.yayinYili = yayinYili;
        this.renkSayisi = renkSayisi;
        this.uretenFirma = uretenFirma;
    }
    
    public Projector(int buyukluk, int yayinYili, int renkSayisi) {
        this.buyukluk = buyukluk;
        this.yayinYili = yayinYili;
        this.renkSayisi = renkSayisi;
    }
    private void setUretenFirma(String s){
        uretenFirma = s;
    }
    public String getUretenFirma(){
        return uretenFirma;
    }
    @Override
    public void ac() {
        System.out.println("Projector Acildi");
    }
    @Override
    public void kapat() {
        System.out.println("Projector Kapandi");
    }
    @Override
    public void goster() {
        System.out.println("Projector gosteriyor" + " Her hangi birsey Girilmedi");
    }
    @Override
    public void goster(String yazi) {
        System.out.println("Projector gosteriyor" + yazi);
    }
    
}

class YayinYap{
    public static void yayinYap(Cihaz[] cihazlar){
        for (Cihaz cihaz : cihazlar) {
            cihaz.ac();
            cihaz.goster(" TEST YAYINI");
            cihaz.goster();
            cihaz.kapat();
        }
    }
    public static void main(String[] args) {
        Cihaz c1 = new TV();
        Cihaz c2 = new LCD();
        Cihaz c3 = new Projector();
        
        Cihaz[] dizi = new Cihaz[3];
        dizi[0] = c1;
        dizi[1] = c2;
        dizi[2] = c3;
        YayinYap.yayinYap(dizi);
    }
}


