/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalinsurances;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ENG.Boody
 */
public class Pharmacies {

    public void GizaPharmacies() {
        try {
            FileWriter Pharmacies = new FileWriter("Pharmacies.txt");
            Pharmacies.write("Seif Pharmacy" + " , " + "417 الهرم، أولى الهرم، الجيزة" + " , " + "02 35859133" + " , " + "\n");
            Pharmacies.write("El Ezaby Pharmacy" + " , " + "134 البحر الأعظم، St، الجيزة، 12511" + " , " + "02 35690259" + " , " + "\n");
            Pharmacies.write("Roshdy Pharmacy" + " , " + "13 ش نبيل الوقاد، الدقي، الجيزة" + " , " + "02 33362475" + " , " + "\n");
            Pharmacies.write("Fouda Pharmacy" + " , " + "الجيزة, المهندسين" + " , " + "02 33031481" + " , " + "\n");
            Pharmacies.write("Misr Pharmacy" + " , " + "5 مراد، أولى، الجيزة" + " , " + "02 25476106" + " , " + "\n");
            Pharmacies.close();
        } catch (IOException e) {

        }
    }



    public void CairoPharmacies() {
        try {
            FileWriter Pharmacies2 = new FileWriter("Pharmacies2.txt");
            Pharmacies2.write("Fathy Pharmacy" + " , " + "3 ش 154، معادي الخبيري الوسطي، حي المعادي، محافظة القاهرة‬" + " , " + "02 25254357" + " , " + "\n");
            Pharmacies2.write("Ali&Ali Pharmacy" + " , " + "399 ش رمسيس، عباسية، الوايلى، محافظة القاهرة‬" + " , " + "02 26859008" + " , " + "\n");
            Pharmacies2.write("El Leithy Pharmacy" + " , " + "28 محمد مظهر، St، الزمالك، محافظة القاهرة‬ 11568" + " , " + "02 33362475" + " , " + "\n");
            Pharmacies2.write("Shady Pharmacy" + " , " + "أبو الفرج، روض الفرج البلد، قسم روض الفرج، محافظة القاهرة‬" + " , " + "02 24579367" + " , " + "\n");
            Pharmacies2.write("Mahmoud abdelalim Pharmacy" + " , " + "9 gamea sallam, bab elshareya, باب الشعرية، محافظة القاهرة‬ 11271" + " , " + "02 27878779" + " , " + "\n");
            Pharmacies2.close();
        } catch (IOException e) {

        }
    }
        public void AlexandriaPharmacies() {
        try {
            FileWriter Pharmacies3 = new FileWriter("Pharmacies3.txt");
            Pharmacies3.write("Sabry Pharmacy" + " , " + "452 أبو قير، مصطفى كامل وبولكلي، Alexandria, الإسكندرية" + " , " + "03 5852785" + " , " + "\n");
            Pharmacies3.write("TAJ Pharmacy" + " , " + "الاسكندرية, سان استيفانو" + " , " + "03 5852785" + " , " + "\n");
            Pharmacies3.write("Khalil Pharmacy" + " , " + "شارع الكازينو، سان ستفانو، قسم الرمل، الإسكندرية" + " , " + "03 4690095" + " , " + "\n");
            Pharmacies3.write("Ossama El Tayeby Pharmacy" + " , " + "عمارات الفرات, مصطفى كامل، سيدي جابر، الإسكندرية" + " , " + "03 5229700" + " , " + "\n");
            Pharmacies3.write("Farhy Pharmacy" + " , " + "2 سيدي جابر، الإسكندرية" + " , " + "03 5423524" + " , " + "\n");
            Pharmacies3.close();
        } catch (IOException e) {

        }
    }
}
