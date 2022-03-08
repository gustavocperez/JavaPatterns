package br.com.gustavo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[]args) throws IOException {



        GetPlanFactory fabrica = new GetPlanFactory();

        System.out.println("Entre com o tipo de conta");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String planType = buff.readLine();

        Plan userPlan = fabrica.getPlan(planType);

        System.out.println("Conta do Usuario");
        userPlan.getRate();
        userPlan.calculateBill(10);
    }

}
