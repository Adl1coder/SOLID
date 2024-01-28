package LiskovSubstitutionPrinciple;

class Araba {
    // Araba sınıfının detayları burada olabilir
}

class ElektrikliAraba extends Araba {
    // Elektrikli araba sınıfının detayları burada olabilir
}

class ArabaKullanimi {
    public static void main(String[] args) {
        Araba araba = new ElektrikliAraba();
        // ElektrikliAraba, Araba'nın yerine kullanılabilir
    }
}

