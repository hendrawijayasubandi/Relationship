/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testing;
import java.util.Date;

/**
 *
 * @author HP
 */
 class Person{
        private String name;
        public Person(){                        // constructor 1
            name = "No name yet.";
        }
        public Person (String initialName){     // constructor 2
            name = initialName;
        }
        public void setName(String newName){
            name = newName;
        }
        public String getName(){
            return name;
        }
        public void writeOutput(){
            System.out.println("Name: " + name);
        }
        public boolean sameName(Person otherPerson){
            return (this.name.equalsIgnoreCase(otherPerson.name));
        }
    }

public class Relationship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student2 s = new Student2("Niko", 730015);
            s.printInfo();
        }
    }
    
    public class Student2 extends Person {
        public String name;
        private int number;
        private Date enrollmentDate; // student has a Date class
        public Student2(String initName, int initNumber){
            name = initName;
            number = initNumber;
            enrollmentDate = new Date();
        }
        private void printInfo(){
            System.out.println("Name: " + name);
            System.out.println("Number: " + number);
            System.out.println("Enrollment Date: " + enrollmentDate);
        }
        public static void main (String[] args){
            Student2 s = new Student2("Niko", 730015);
            s.printInfo();
        }
        
        //mahasiswa.java
        public class mahasiswa{
            private String nim;
            private String nama;
            
            public void setnama (String nama) {
                this.nama = nama;
            }
            public void setnim (String nim) {
                this.nim = nim;
            }
            public String getnim() {
                return this.nim;
            }
            public String getnama() {
                return this.nama;
            }
        }
        
        //dosen.java
        public class dosen{
            private String Kddosen;
            private String[] nimMHS;
            private int JmlMahasiswa;
            public void setKddosen (String Kddosen){
                this.Kddosen = Kddosen;
            }
            public void setNumMahasiswa (String nimMhs) {
                if (JmlMahasiswa<5) {
                    nimMHS[JmlMahasiswa] = nimMhs;
                    JmlMahasiswa++;
                }
            }
            public String getKddosen (){
                return this.Kddosen;
            }
            public String getmahasiswa (int i) {
                return (nimMHS[i]);
            }
    }
}
