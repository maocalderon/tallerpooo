
package tallerpooo;

/**
 *
 * @author USUARIO
 */
public class main {

   
    public static void main(String[] args) {
        
        persona persona= new persona();
        
        System.out.println("calcular IMC de la persona:" +persona.calcularIMC());
        System.out.println(persona.esMayorDeEdad());
     
        System.out.print(persona.generaCedula());
        
        
    }
    
}
