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
    //  Modo reproduccion 
    public int menuRep (){
        System.out.println("Las opciones para el modo reproductor son: \n1: Mostrar playlists\n2: Mostrar cancion\n3: Reproducir cancio\n: Cerrar reproductor");
 
        int t = 1;
        String sr ="";

        while(t !=0 ){
            sr = sc.next();
            if(sr.equals("1")||st.equals("2")||sr.equals("3")||sr.equals("4")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }

        }
        return Integer.parseInt(st);
        
        //Cambiar Cancion 
    }


    public void mostrarPlayList(ArrayList<String[]> playlist1, ArrayList<String[]> playlist2, ArrayList<String[]> playlist3){
        System.out.println("Playlist 1: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + playlist1.get(p)[0] + " tiutulo de la cancion: " + playlist1.get(p)[1] + " Duracion: " + playlist1.get(p)[2] + "genero: " + playlist1.get(p)[3]);

        }

        System.out.println("\nPlaylist 2: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + playlist2.get(p)[0] + " tiutulo de la cancion: " + playlist2.get(p)[1] + " Duracion: " + playlist2.get(p)[2] + "genero: " + playlist2.get(p)[3]);

        }

        System.out.println("\nPlaylist 3: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + playlist3.get(p)[0] + " tiutulo de la cancion: " + playlist3.get(p)[1] + " Duracion: " + playlist3.get(p)[2] + "genero: " + playlist3.get(p)[3]);

        }
    }

    public String[] SeleccionarCancion(ArrayList<String[]> playlist1, ArrayList<String[]> playlist2, ArrayList<String[]> playlist3){
        System.out.println("Playlist 1: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + playlist1.get(p)[0] + " tiutulo de la cancion: " + playlist1.get(p)[1] + " Duracion: " + playlist1.get(p)[2] + "genero: " + playlist1.get(p)[3]);

        }

        System.out.println("\nPlaylist 2: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + playlist2.get(p)[0] + " tiutulo de la cancion: " + playlist2.get(p)[1] + " Duracion: " + playlist2.get(p)[2] + "genero: " + playlist2.get(p)[3]);

        }

        System.out.println("\nPlaylist 3: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + playlist3.get(p)[0] + " tiutulo de la cancion: " + playlist3.get(p)[1] + " Duracion: " + playlist3.get(p)[2] + "genero: " + playlist3.get(p)[3]);

        }

        System.out.println("Que playlist quiere desea utilizar: ");
        int j = 1;
        String psele = "";

        while(j != 0){
            psele = sc.nextLine();
            if(psele.equals("1")||psele.equals("2")||psele.equals("3")){
                j = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }

        ArrayList<String[]> pListseleccionada = new ArrayList<String[]>();
        if(Integer.parseInt(psele)==1){
            pListseleccionada = playlist1;
        }else if(Integer.parseInt(psele)==2){
            pListseleccionada = playlist2;
        }else if(Integer.parseInt(psele)==3){
            pListseleccionada = playlist3;
        }

        System.out.println("\nPlaylist seleccionada: ");
        for(int p = 0; p<playList1.size();p++){
            System.out.println((p+1)+" Nombre del artista: " + pListseleccionada.get(p)[0] + " tiutulo de la cancion: " + pListseleccionada.get(p)[1] + " Duracion: " + pListseleccionada.get(p)[2] + "genero: " + pListseleccionada.get(p)[3]);

        }

        System.out.println("Que cancion quiere escuchar: ");
        int g = 1;
        String csele = "";

        while(g != 0){
            csele = sc.nextLine();
            if(csele.equals("1")||csele.equals("2")||csele.equals("3")){
                j = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }


        String[] can = pListseleccionada.get(Integer.parseInt(csele)-1)

        return can;

    }



}
