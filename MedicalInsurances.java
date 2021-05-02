/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalinsurances;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MOHAM
 */
public class MedicalInsurances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        for(int i=1;i>0;i++){
        Scanner scan = new Scanner(System.in);
        String x, c;
        int a;
        String pn;
        String c2,c3;
        Patients p3 = new Patients();
        Hospitals h1 = new Hospitals();
        h1.GizaHospitals();
        h1.CairoHospitals();
        h1.AlexHospitals();
        Pharmacies p1 = new Pharmacies();
        p1.GizaPharmacies();
        p1.CairoPharmacies();
        p1.AlexandriaPharmacies();
        System.out.println("*********** Welcome To Your Medical Insurances ***********");
        int y;
        System.out.println("1.Add a new patient \n 2.Find a Hospital \n 3.Find a Pharmacy \n 4.Exit");
        y = scan.nextInt();
        switch (y) {
            case 1:
                System.out.println("Please Enter Name");
                x = scan.next();
                p3.setinformation(x);
                System.out.println("Please Enter Age");
                a = scan.nextInt();
                p3.setinformation(a);
                System.out.println("Please Enter Phone Number");
                pn = scan.next();
                p3.setPhoneNumber(pn);
                System.out.println("Please Enter City");
                c = scan.next();
                p3.setCity(c);
                p3.Storeinformation();
                break;
            case 2:
                System.out.println("Please Enter City to find a hospital in Region");
                c2 = scan.next();
                switch (c2) {
                    case "Giza":
                        BufferedReader br = new BufferedReader(new FileReader("Hospitals.txt")); 
                            String line;
                            while ((line = br.readLine()) != null) {
                                System.out.println(line);
                            }
                        
                        break;
                    case "Cairo":
                        BufferedReader brt = new BufferedReader(new FileReader("Hospitals2.txt")); 
                            String line1;
                            while ((line1 = brt.readLine()) != null) {
                                System.out.println(line1);
                }break;
                    case "Alexandria":
                        BufferedReader brtt = new BufferedReader(new FileReader("Hospitals3.txt")); 
                            String line2;
                            while ((line2 = brtt.readLine()) != null) {
                                System.out.println(line2);

        }break;

    }break;
            case 3:
                System.out.println("Please Enter City to find a Pharmacy in Region");
                c3 = scan.next();
                switch (c3){
                    case "Giza":
                        BufferedReader br = new BufferedReader(new FileReader("Pharmacies.txt")); 
                            String line1;
                            while ((line1 = br.readLine()) != null) {
                                System.out.println(line1);
                }break;
                    case "Cairo":
                        BufferedReader brt = new BufferedReader(new FileReader("Pharmacies2.txt")); 
                            String line3;
                            while ((line3 = brt.readLine()) != null) {
                                System.out.println(line3);}break;
                    case "Alexandria":
                        BufferedReader brtt = new BufferedReader(new FileReader("Pharmacies3.txt")); 
                            String line2;
                            while ((line2 = brtt.readLine()) != null) {
                                System.out.println(line2);}break;

    }case 4:
        System.exit(0);}
        }}}
