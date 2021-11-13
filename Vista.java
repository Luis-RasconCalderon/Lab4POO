import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);


    public int escogerTipoRadio(){
        System.out.println("Que tipo de radio desea utilizar?: \n1: Tipo A\n2: Tipo B\n3: Tipo C");
        int t = 1;
        String tipo ="";

        while(t !=0 ){
            tipo = sc.next();
            if(tipo.equals("1")||tipo.equals("2")||tipo.equals("3")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }

        }
        return Integer.parseInt(tipo);
    }

    public int escogetModo(String productividad){
        System.out.println("Que modo de radio desea utilizar?: \n1: Radio(Emisoras)\n2: Reproductor\n3: Teléfono");
        System.out.println(productividad +"\n5: Salir");
        int t = 1;
        String modo ="";

        while(t !=0 ){
            modo = sc.next();
            if(modo.equals("1")||modo.equals("2")||modo.equals("3")||modo.equals("4")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }

        }
        return Integer.parseInt(modo);
    }

    public void emitirMensaje(String txt){
        System.out.println(txt);
    }
}
