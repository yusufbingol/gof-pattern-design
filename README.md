# gof-pattern-design
Representing the hierarchical structure of a company's employees using an appropriate design pattern.

Temel Gereksinimler:

* Bir firmanın çalışanlarına ilişkin hiyerarşik yapının, uygun bir tasarım deseni kullanılarak
temsil edilmesi istenmektedir. Firmada, “Direktör” ve “Memur” çalışanların olduğu
varsayılmaktadır. Bir direktörün emrinde sıfır veya N tane çalışan (memur veya direktör)
olabilmektedir. Çalışanlar için String tipinde adSoyad ve tamsayı (int) tipinde maaş verileri
bulunmaktadır.

Oluşturulması istenen yapıda desteklenmesi istenen iki işlem vardır. Bunlardan birincisi, bir
direktörün hiyerarşik olarak altında çalışanların listelenmesidir (direktörün kendi adı da liste
başına yazılabilir.) (Eğer memur için emrinde çalışanlar listelenmek istenirse, memurun adı
liste başına yazılabilir ancak doğal olarak liste boş kalacaktır.) Diğer işlem ise, her hangi bir
çalışanın firmaya maliyetinin hesaplanmasıdır: Direktörlerin maliyeti kendi maaşı artı
emrinde çalışanların maaşları toplamıdır. Bir memurun firmaya maliyeti ise sadece kendi
maaşı kadardır. Söz edilen iki işlem tasarımınızda ilgili sınıflar içinde desteklenmelidir.
Bunların dışında gerekli olan tüm metotlar sizin tarafınızdan yazılmalıdır.

* Hiyerarşik yapının dolaşılması için Iterator deseni kullanılacaktır. Iterator desenini
kendinizin baştan yazması istenmektedir, Java ortamındaki hazır Iterator desenini
kullanmayınız. Hiyerarşik yapıda ihtiyacınız olan koleksiyonu dizi tabanlı olarak (ArrayList
değil). Iterator deseni çerçevesinde tanımlamanız gerekmektedir.
