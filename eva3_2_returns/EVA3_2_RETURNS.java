/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_returns;

/**
 *
 * @author Jose Enrique
 */
public class EVA3_2_RETURNS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SI REGRESA, TENEMOS DOS OPCIONES
        //HACER ALGO CON EL VALOR
           // GURADALO Y USARLO VARIAS VECES
           int valor;
            valor = sumarEnteros(100, 50);
            System.out.println("Resultado = "+valor);
             //USARLO UNA VEZ
             System.out.println("Resultado = "+  sumarEnteros(100, 50));
        //IGNORAR EL VALOR
         sumarEnteros(100, 50);
        
    }
    //Sumar dos enteros 
    public static int sumarEnteros(int num1,int num2){
        int resu;
        resu = num1 + num2;
        return resu;
        
        
        //System.out.println("");
        
        
        
    }
}
