import java.util.InputMismatchException;
public class Validacion {
    public void Validar(){

        Menu acceder = new Menu();
        while ( true ) {

            try {
                acceder.Menu1();
                if (!acceder.getNombre().matches("[a-zA-Z]+")) {
                     throw new InputMismatchException();
        
                }
                break;
             
             
            } catch ( InputMismatchException e) {
                System.out.println("Nombre no valido / Por favor, digita un nombre valido para escribirlo de nuevo presiona la tecla Enter para continuar.");
                acceder.ver.nextLine();
                acceder.setNombre("");
                
               
            }
            
        }

        while ( true ) {
            try {
                acceder.Menu2();
                break;
            } catch (NullPointerException | InputMismatchException e) {
                
                System.out.println("Número no valido, por favor digite un número valido ");
                acceder.ver.nextLine();
            }
            
        }
        
            try {
                acceder.Ejecutar();

            } catch (InputMismatchException e) {
                System.out.println("Fin del programa");
                acceder.ver.nextLine();
            }
            acceder.ver.close();

      
    }
}

       
           
        