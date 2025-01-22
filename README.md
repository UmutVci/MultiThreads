Aufgabe: Çoklu Dosya İşleme ve Muhasebe
Bir şirketin gelir ve giderlerini işlemek için bir Java uygulaması geliştirmeniz gerekiyor. Uygulama, bir ana dosya alır ve bu dosya içinde başka dosyaların isimlerini barındırır. Bu alt dosyaların her biri gelir ve gider bilgilerini içerir. Göreviniz, bu dosyalardaki tüm gelir ve gider verilerini işlemek ve toplam gelir ve gideri ekrana yazdıran bir program yazmaktır.

Detaylar:
Ana dosya, alt dosya isimlerini satır satır içerir.
Her alt dosya, şu formatta satırlar içerir:

<İşlemAdı>,<Tür>,<Tutar>
İşlemAdı: İşlemin adı (örneğin, Satış, Maaş vb.).
Tür: Gelir (Gelir) veya Gider (Gider).
Tutar: İşlem tutarı (pozitif bir tam sayı).
Gelir ve gider bilgilerini işlemek için her alt dosya ayrı bir Thread tarafından işlenecektir.
Tüm thread'ler tamamlandıktan sonra toplam gelir ve gider ekrana yazdırılacaktır.
Yapılacaklar:
Ana dosyayı okuyarak alt dosyaların isimlerini alın.
Her alt dosya için ayrı bir thread kullanarak gelir ve giderleri işleyin.
Geçersiz satırları tespit edip hata mesajı yazdırın (örneğin: "Uygunsuz metin").
Tüm işlemler tamamlandıktan sonra toplam gelir ve gideri ekrana yazdırın.
