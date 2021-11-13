import java.util.Scanner;
import java.util.ArrayList;

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

    public int menuTele(String esp){
        System.out.println("Las opciones para el modo telefono son: \n1: Mostrar contactos\n2: Llamar contacto\n3: Colgar llamada");
        System.out.println(esp);
        System.out.println("\n5: Desconectar telefono y salir del modo telefono.");
 
        int t = 1;
        String st ="";

        while(t !=0 ){
            st = sc.next();
            if(st.equals("1")||st.equals("2")||st.equals("3")||st.equals("4")||st.equals("5")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }

        }
        return Integer.parseInt(st);
    }

    public void mostrarContactos(ArrayList<String[]> agenda){
        System.out.println("\nLos contactos son: \n");
        for(int a= 0; a <agenda.size();a++){
            System.out.println("Nombre: " + agenda.get(a)[0] + "--------- Numero: "+agenda.get(a)[1]+"\n");
        }
    }

    public String[] llamarContacto(ArrayList<String[]> agenda){
        System.out.println("\nA que contacto desea llamar?: \n");
        for(int a= 0; a <agenda.size();a++){
            System.out.println("Nombre: " + agenda.get(a)[0] + "--------- Numero: "+agenda.get(a)[1]+"\n");
        }

        int t = 1;
        String c ="";


        while(t !=0 ){
            c = sc.next();
            if(Integer.parseInt(c)<agenda.size()&Integer.parseInt(c)>0){
                System.out.println("\nLLamando al contacto: "+ agenda.get(Integer.parseInt(c))[0]);
                System.out.println("Numero: "+agenda.get(Integer.parseInt(c))[0]);
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }

        return agenda.get(Integer.parseInt(c));
    }

    public void colgar(){
        System.out.println("Se ha colgado la llamada.");
    }




}
