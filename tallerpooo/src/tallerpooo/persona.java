
package tallerpooo;

import java.util.Random;

    public class persona {
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;
    
    
    public persona(){
    }
    
  
    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //getters and setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    //metodo para obener el imc
    public int calcularIMC(){
        double IMC;
        IMC = (peso/(Math.pow(peso, 2)));
        if(IMC<20){
            return -1;
        }else if(IMC<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
   
    public boolean esMayorDeEdad(){
        return edad>=18;
    }
    
    //metodo para comprobar sexo
    public char comprobarSexo(char sexo){
        if (sexo == 'H'){  
            return 'H';
        }else if(sexo == 'M') {
            return 'M';
        }else{
            System.out.println("Sexo es incorrecto: Se establecerá como 'H'");
            return 'H';
        }
    }
    
     public String generaCedula(){
        Random random = new Random();
        StringBuilder numeroAleatorio = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digito = random.nextInt(10);
            numeroAleatorio.append(digito);
        }
        return numeroAleatorio.toString();
        
    }

}