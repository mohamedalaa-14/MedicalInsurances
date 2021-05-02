/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalinsurances;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MOHAM
 */
public class Patients {

    Scanner scan = new Scanner(System.in);
    private String CustomerName, PhoneNumber, City;
    private int Age;

    public void setinformation(String n1) {
        CustomerName = n1;
    }

    public void setinformation(int a2) {
        Age = a2;
    }

    public void setPhoneNumber(String nm1) {
        PhoneNumber = nm1;
    }

    public void setCity(String c1) {
        City = c1;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getAge() {
        return Age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCity() {
        return City;

    }
    public void Storeinformation(){
            try {
      FileWriter fout = new FileWriter("filename.txt");
     fout.write(getCustomerName()+" , "+getAge()+" , "+getPhoneNumber()+" , "+getCity()+" "+"\n");
     fout.close();
    } 
    catch (IOException e) {
   
    }
   
    }

   

  
}
