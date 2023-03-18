
package com.mycompany.ejercicio12_actividad2;

import java.util.Scanner;

public class Ejercicio12_actividad2 {

    public static void main(String[] args) {
        
      
        Scanner leerporteclado = new Scanner(System.in);
        
        String NOM;
        double NHT, VHN, HET, HEE8, SALARIO;
        
        System.out.print("Digite el nombre del trabajador: ");
        NOM = leerporteclado.nextLine();
        
        System.out.print("Digite el numero de horas normales trabajadas: ");
        NHT = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el valor de las horas normales trabajadas: ");
        VHN = leerporteclado.nextDouble();
        
        if (NHT > 40){
            HET = NHT -40;
            if (HET > 8){
                HEE8 = HET -8;
                SALARIO = 40*VHN+16*VHN+HEE8*3*VHN;
            }else{
                SALARIO = 40*VHN+HET*3*VHN;
            }
        }else{
            SALARIO = NHT*VHN;
        }
        
        System.out.print("El trabajador "+NOM+" devengo: $"+SALARIO);
    }
}
