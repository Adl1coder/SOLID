package InterfaceSegregationPrinciple;

interface Surus {
    void ileriGit();
    void geriGit();
}

interface Park {
    void parkEt();
}

class Araba implements Surus, Park {
    @Override
    public void ileriGit() {
        // İleri git işlemleri
    }

    @Override
    public void geriGit() {
        // Geri git işlemleri
    }

    @Override
    public void parkEt() {
        // Park et işlemleri
    }
}
