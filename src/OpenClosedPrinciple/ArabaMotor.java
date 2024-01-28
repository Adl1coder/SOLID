package OpenClosedPrinciple;

interface ArabaMotor {
    void calistir();
}

class BenzinliMotor implements ArabaMotor {
    @Override
    public void calistir() {
        System.out.println("Benzinli motor çalıştı.");
    }
}

class ElektrikliMotor implements ArabaMotor {
    @Override
    public void calistir() {
        System.out.println("Elektrikli motor çalıştı.");
    }
}

class Araba {
    String model;
    String renk;
    ArabaMotor motor;

    public Araba(String model, String renk, ArabaMotor motor) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
    }

    public void calistir() {
        motor.calistir();
    }
}

class ArabaKullanimi {
    public static void main(String[] args) {
        Araba benzinliAraba = new Araba("Toyota", "Beyaz", new BenzinliMotor());
        Araba elektrikliAraba = new Araba("Tesla", "Siyah", new ElektrikliMotor());

        benzinliAraba.calistir();
        elektrikliAraba.calistir();
    }
}
