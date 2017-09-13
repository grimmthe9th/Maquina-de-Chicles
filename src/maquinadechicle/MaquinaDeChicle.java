/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadechicle;

/**
 *
 * @author alumno
 */
public class MaquinaDeChicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funciones fc = new Funciones();
      int moneda = 0;
      int girarManivela = 1;
      int chicles = 0;
      int totalActual = 15;
      int recargar = 3;
      boolean recargaStock = true; 
      for (int i = 1 ; i < 5 ; i++) {
            
            
            
            
            fc.pedirNuevamente= true;
            
            while (fc.pedirNuevamente) {
                System.out.println("CHICLES a $1 ");
                System.out.println("Stock disponible: " + totalActual );
                System.out.println("Inserte monedas (minimo 1 , maximo 5)");
                
                moneda = (int) fc.leer();
               
                switch (moneda){
                    case 1: 
                        System.out.println(" ha depositado 1,00 pesos");
                     break;
                     case 2: 
                        System.out.println(" ha depositado 2,00 pesos");
                     break;
                     case 3: 
                        System.out.println(" ha depositado 3,00 pesos");
                     break;
                     case 4: 
                        System.out.println(" ha depositado 4,00 pesos");
                     break;
                     case 5:
                         System.out.println("sa depositado 5,00 pesos");
                     break;
                     
                }
                 chicles = moneda;
                
                System.out.println("usted obtiene " + chicles + " chicles" );
                
                System.out.println("----------------------------------");
           
            
            }
            fc.pedirNuevamente = true;
            
            while (fc.pedirNuevamente) {
                System.out.println(" presiona 1 para girar manivela o 0 para cancelar");
                girarManivela = (int) fc.leer();
                if (girarManivela == 1) {
                    
                    System.out.println(" esperando.....");
                    if (totalActual == 0) {
                    System.out.println("Stock Agotado");
                    System.out.println("Retornando importe, se han retornado : $"+ moneda +" pesos" );
                    System.out.println(" Gracias por su compra ");
                    break;
                    }else{
                    System.out.println(" Puede retirar sus chicles.Gracias por su compra");
                    System.out.println("----------------------------------");
                    }
                    totalActual = totalActual - chicles;
                } else {
                
                    System.out.println("accion cancelada..");
                    System.out.println("Retornando importe, se han retornado : $"+ moneda +" pesos");
                    System.out.println(" Gracias por su compra ");
                    System.out.println("----------------------------------");
                    totalActual = totalActual;
                }
                
                
               
                break;
               
                
            } 
            if (totalActual==0) {
               
                fc.pedirNuevamente= true;
                int cantidadARecargar = 15;
                while (fc.pedirNuevamente) {
                    System.out.println("Stock agotado desea agregar mas chicles");
                    fc.pedirNuevamente=true;
                    System.out.println("presione 3 para recargar o 0 para cancelar");
                    recargar= (int)fc.leer();
                    if (recargar == 3) {
                        System.out.println("ha recargado stock");
                        totalActual= totalActual + cantidadARecargar;
                    }else{
                    System.out.println("accion cancelada");
                       
                    }
                        
                        break;
                    
                }
               
            }
 
        }
       
    }
    }
    

