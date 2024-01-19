/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir okulda Fizik sınavı şubeler arasında ortak olarak yapılıyor olsun. Ders notları da [0, 100]
	aralığında tamsayılar biçiminde belirlensin. Aşağıdaki açıklamalara göre, ilgili basit simülasyon programını yazınız.
	Açıklamalar:
		- Şube sayısı ve her bir şubedeki öğrenci sayısı klavyeden girilecektir

		- Alınan notlar rasgele olarak belirlenecektir

		- Bu işlemlerden sonra her bir şubenin ayrı ayrı not ortalamasını, okulun bu sınav için not ortalamasını, her bir
		şubenin en düşük ve en yüksek notunu ve okulun bu sınav için en düşük ve en yüksek notunu hesaplayınız

		- Çıktıları dilediğiniz gibi yapabilirsiniz

		- Mümkün olduğunca (şu ana kadar gördüklerimizle) nesne yönelimli olarak düşününüz
	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.simulation.exam;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation examSimulation = new ExamSimulation("Fizik");

        examSimulation.run();
        examSimulation.printReport();
    }

    public static void main(String[] args)
    {
        run();
    }
}
