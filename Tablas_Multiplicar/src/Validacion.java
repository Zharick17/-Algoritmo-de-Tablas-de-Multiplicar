import java.util.InputMismatchException;
public class Validacion {
    public void Validar(){

        Menu acceder = new Menu();
        try {
             acceder.Menu1();

             if (!acceder.getNombre().matches("[a-zA-Z]+")) {
                throw new InputMismatchException();  
             }

        } catch ( InputMismatchException e) {
            System.out.println("Datos  no valido");
            return;
        
        }

        try {
            acceder.Menu2();
            
        } catch (NullPointerException | InputMismatchException e) {
            System.out.println("Debes de digitar un numero");
        }

        try {
            acceder.Ejecutar();
        } catch (NullPointerException | InputMismatchException e) {
            System.out.println("Ingresate un dato no valido");
        }
    }
}
