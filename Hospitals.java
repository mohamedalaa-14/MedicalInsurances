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
 * @author MOHAM
 */
public class Hospitals {

    public void GizaHospitals() {
        try {
            FileWriter Hospitals = new FileWriter("Hospitals.txt");
            Hospitals.write("Misr International Hospital" + " , " + "12ش السرايا، ميدان فيني" + " , " + "02 37608267" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals.write("6th Of October University Hospital" + " , " + "المحور المركزي(طريق النصر)، قسم أول 6 أكتوبر، اول 6 أكتوبر، الجيزة" + " , " + "02 38362487" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals.write("Shajar al-Durr" + " , " + "6 الدكتور الاهواني، أبو الفدا، الزمالك، الجيزة" + " , " + "055 2452255" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals.write("The Memorial Souad Kafafi University Hospital" + " , " + "قسم أول 6 أكتوبر، المتميز، الجيزة" + " , " + "16111" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals.write("Dar Al Fouad" + " , " + "محور 26 يوليو، المنطقة السياحية،، اول 6 أكتوبر، الجيزة " + " , " + "02 38274799" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals.close();
        } catch (IOException e) {

        }
    }

    public void CairoHospitals() {
        try {
            FileWriter Hospitals2 = new FileWriter("Hospitals2.txt");
            Hospitals2.write("Arab Contractors Hospital" + " , " + "الأباجية، مدينة نصر، محافظة القاهرة‬" + " , " + "0101 665 3279" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals2.write("El Rahma Specialized Hospital" + " , " + "37 Alexandria، ميدان الجامع" + " , " + "02 26424981" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals2.write("Cleopatra Hospital" + " , " + "4 Abou Ebaid El Bakry St. Off Ghernata St Roxy، قسم مصر الجديدة، محافظة القاهرة‬" + " , " + "0102 018 6351" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals2.write("San Peter International Hospital" + " , " + "5 ش محمد محمود عزت، مصر الجديدة، القاهرة، محافظة القاهرة‬" + " , " + "02 21808443" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals2.write("AS - Sawra Hospital" + " , " + "11 الثورة، المنتزه، قسم مصر الجديدة، محافظة القاهرة‬" + " , " + "02 22911344" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals2.close();
        } catch (IOException e) {

        }
    }

    public void AlexHospitals() {
        try {
            FileWriter Hospitals3 = new FileWriter("Hospitals3.txt");
            Hospitals3.write("Victoria Hospital" + " , " + "فليب جلاد، القصعي قبلي، Qesm AR Ramel، الإسكندرية" + " , " + "03 5776770" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals3.write("German Hospital" + " , " + "Abdus Salam St، Fleming، قسم الرمل، الإسكندرية" + " , " + "03 5841717" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals3.write("Miami Hospital" + " , " + "32 خليل حماد، سيدي بشر قبلي، قسم المنتزه،" + " , " + "03 5522991" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals3.write("Jeddah Hospital" + " , " + "90 متفرع من ش التلعفرى، المفروزة غرب، قسم مينا البصل" + " , " + "03 4444799" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals3.write("Qasr Elshefaa" + " , " + "الطريق خلال شركة سولفاى المكس طريق إسكندرية، قسم الدخيلة، الإسكندرية" + " , " + "0111 902 0001" + " , " + "Internal Medicine,Gastrointestinal Tract,Cardiac And Catheter,Orthopedics and Spine,Orthopedics,General Surgery, Vascular Surgery and Plastic Surgery" + "\n");
            Hospitals3.close();
        } catch (IOException e) {

        }

    }
}
