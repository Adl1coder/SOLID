# SolidPrinciples

Bu proje, SOLID prensiplerine uygun bir Java uygulamasını içermektedir.
Her bir SOLID prensibine yönelik örnekler içerir ve yazılım tasarımındaki temel prensiplere odaklanarak kod kalitesini artırmayı amaçlar.

## SOLID Prensipleri

### 1. Single Responsibility Principle (SRP) - Tek Sorumluluk Prensibi
Bu prensip, bir sınıfın sadece bir sorumluluğu olması gerektiğini ifade eder. Örneğin, `Araba` sınıfı sadece araba bilgilerini saklamalı ve görüntülemelidir.

### 2. Open/Closed Principle (OCP) - Açık/Kapalı Prensibi
Bu prensip, bir sınıfın değişiklere kapalı, ancak yeni özelliklere açık olması gerektiğini belirtir. Kodu değiştirmeden yeni özellikler eklemeyi sağlar.

### 3. Liskov Substitution Principle (LSP) - Liskov Yerine Koyma Prensibi
Alt sınıflar, üst sınıfların yerine kullanılabilir olmalıdır. Örneğin, `ElektrikliAraba` sınıfı, genel `Araba` sınıfının yerine geçebilmelidir.

### 4. Interface Segregation Principle (ISP) - Arayüz Ayırma Prensibi
Bir sınıfın ihtiyaç duymadığı metotları içermemesi gerektiğini belirtir. Arayüzler, sadece ihtiyaç duyulan metotları içermelidir.

### 5. Dependency Inversion Principle (DIP) - Bağımlılıkları Tersine Çevirme Prensibi
Üst seviye modüller, alt seviye modüllere bağlı olmamalıdır. Her ikisi de soyutlamalara bağlı olmalıdır. Örneğin, `Araba` sınıfı, `ArabaMotor` arayüzüne bağlı olmalıdır.

## Projenin Kullanımı

1. Proje dosyalarını bilgisayarınıza kopyalayın.
2. Java IDE'sini kullanarak projeyi açın.
3. Örnekleri ve SOLID prensiplerini inceleyin.

## Katkıda Bulunma

1. Bu depoyu fork edin.
2. Yeni özellik eklemek veya hata düzeltmek için bir dal oluşturun.
3. Değişikliklerinizi yapın ve bir pull request oluşturun.



