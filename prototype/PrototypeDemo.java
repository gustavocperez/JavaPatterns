package br.com.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employe id: ");
        int eid=Integer.parseInt(br.readLine());
        System.out.println("\n");
        System.out.println("Enter employee name: ");
        String ename=br.readLine();
        System.out.println("\n");
        System.out.println("Enter employee destignation: ");
        String edesignation= br.readLine();
        System.out.println("\n");
        System.out.println("Enter Employee Address: ");
        String eaddres=br.readLine();
        System.out.println("\n");
        System.out.println("Enter employee Salary: ");
        double esalary= Double.parseDouble(br.readLine());
        System.out.println("\n");

        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddres);
        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();

        e2.showRecord();
    }

}
