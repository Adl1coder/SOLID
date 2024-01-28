package SingleResponsibility;

class Araba {
    String model;
    String renk;

    public Araba(String model, String renk) {
        this.model = model;
        this.renk = renk;
    }

    // Araba sınıfının sorumlulukları burada olmalıdır
    public void bilgileriGoster() {
        System.out.println("Model: " + model);
        System.out.println("Renk: " + renk);
    }
}

class ArabaKullanimi {
    public static void main(String[] args) {
        Araba araba = new Araba("BMW", "Siyah");

        // Araba sınıfının sorumluluklarından biri
        araba.bilgileriGoster();
    }
}
