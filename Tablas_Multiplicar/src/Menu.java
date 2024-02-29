import java.util.Scanner;
public class Menu {

    private Integer numero ;
    private String nombre;
    Scanner ver=new Scanner(System.in);
   
    public void Menu1(){
    
       System.out.println("Cual es tu nombre: ");
       nombre = ver.nextLine();
    }

    

    public void Menu2(){
        System.out.println("Hola "+ nombre + " que tabla de multiplicar quieres ver del 1 al 10: "); 
        numero = ver.nextInt();
    }

    public void Ejecutar(){
        int continuar = 1;
       while (continuar == 1) {

        int i = 0;

        while (i <= 10) {
            int resultado = i * numero;
            System.out.println(numero + "x"+i+ "=" + resultado );
            i++;
            
        }
        
        System.out.println("Para ver otra tabla de multiplicar presiona uno "+ continuar);
        continuar = ver.nextInt();

        Menu2();
   
       }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    
}
