/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.Operaciones;

/**
 *
 * @author Leonardo
 */
public class OpSecundaria {
    
    public static float Multiplicacion(float a, float b){
        return a*b;
    }
    public static float Division(float a, float b){
        if (b == 0){
            System.out.println("No se puede divir entre cero");
            return a;
        }
        return a/b;
        
    }
}
