/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Eduardo
 */
public class Figuras extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static JLabel titulo = new JLabel("Triangulo");
    public static JLabel area = new JLabel("Area");;
    public static void main(String[] args) {
        
      
       inicio();

    }
    
       
   public static void inicio (){
       
       int op = validador (menu());
        
       Scanner sc = new Scanner(System.in);
        switch(op){
            case 1:
                System.out.println("Ingrese la base");
                int base = sc.nextInt();
                System.out.println("Ingrese la altura");
                int altura = sc.nextInt();
                Triangulo triangulo = new Triangulo(base, altura);
                
                 
                JFrame marco = new JFrame("Triangulo");
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                titulo.setBounds(50, 10, 200, 10);
                 
                area.setText("Area: "+Double.toString(triangulo.area()));
                area.setBounds(50, 10, 200, 40);
                marco.add(titulo);
                marco.add(area);
                
                marco.add(triangulo);
                marco.setSize(120+(int)triangulo.getBase(),130+(int)triangulo.getAltura());
                marco.setVisible(true);
                System.out.println("El área es: " +triangulo.area());
                
                break;
             
            case 2:
                 System.out.println("Puedes seguir programando más opciones aquí :D");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
   }

  public static String menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija una opción");
        System.out.println("Ingrese 1 para triangulo");
        String respuesta = sc.next();
        return respuesta;
   }   

   public static int validador (String respuesta){
     
       int op =0;       
       while(op==0){
        try{
            op = Integer.parseInt(respuesta); 
            if(op>2){//Validación en el switch para que no termine la ejecución
                op=0;//Reseteams el valor ya que es mayor al de las opciones
                System.out.println("Opción incorrecta");
                respuesta = menu();//Preguntamos de nuevo el valor
            }
        }catch(Exception e){//Atrapamos cualquier error
             System.out.println("Error: "+e.getMessage());
             respuesta = menu(); //Preguntamos de nuevo el valor   
        }
       }
        return op;//Retornamos la opcion ya validada 
       
   }
}

