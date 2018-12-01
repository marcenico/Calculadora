/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.Operaciones;

/**
 *
 * @author Marcelo
 */
public class Operaciones {

    public Operacion operacion;

    public enum Operacion {
        suma, resta, multiplicacion, divicion
    }

    public Operaciones(Operacion operacion) {
        this.operacion = operacion;
    }

    public float HaceOperacion(float numero1, float numero2) {

        switch (operacion) {
            case suma:
                return OpPrimaria.Suma(numero1, numero2);
            case resta:
                return OpPrimaria.Resta(numero1, numero2);
            case multiplicacion:
                return OpSecundaria.Multiplicacion(numero1, numero2);
            case divicion:
                return OpSecundaria.Division(numero1, numero2);
            default:
                System.out.println("ERROR");
                break;
        }
        return 0;
    }

}
