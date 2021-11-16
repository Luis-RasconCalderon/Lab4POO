import java.util.Scanner;
import java.util.ArrayList;

public class Vista {
    private Scanner sc = new Scanner(System.in);


    public int escogerTipoRadio(){
        System.out.println("\nQue tipo de radio desea utilizar?: \n1: Tipo A\n2: Tipo S\n3: Tipo C");
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

    public int menuGeneral(String productividad){
        System.out.println("\n\nSeleccione una opcion?: \n1: Radio(Emisoras)\n2: Reproductor\n3: Teléfono");
        System.out.println(productividad +"\n5: Subir volumen\n6: Bajar volumen\n7: Apagar radio y salir.");
        int t = 1;
        String modo ="";

        while(t !=0 ){
            modo = sc.next();
            if(modo.equals("1")||modo.equals("2")||modo.equals("3")||modo.equals("4")||modo.equals("5")||modo.equals("6")||modo.equals("7")){
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
        System.out.println("\nLas opciones para el modo telefono son: \n1: Mostrar contactos\n2: Llamar contacto\n3: Colgar llamada");
        System.out.println(esp);
        System.out.println("5: Desconectar telefono y salir del modo telefono.");
 
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
                System.out.println("\nLLamando al contacto: "+ agenda.get(Integer.parseInt(c)-1)[0]);
                System.out.println("Numero: "+agenda.get(Integer.parseInt(c)-1)[1]);
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }

        return agenda.get(Integer.parseInt(c)-1);
    }

    public void colgar(){
        System.out.println("\nSe ha colgado la llamada.");
    }
    //  Modo reproduccion 
    public int menuRep (){
        System.out.println("\nLas opciones para el modo reproductor son: \n1: Mostrar playlists\n2: Mostrar cancion\n3: Reproducir cancion\n4: Cerrar reproductor");
 
        int t = 1;
        String sr ="";

        while(t !=0 ){
            sr = sc.next();
            if(sr.equals("1")||sr.equals("2")||sr.equals("3")||sr.equals("4")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }

        }
        return Integer.parseInt(sr);
    }


    public void mostrarPlayList(ArrayList<String[]> playlist1, ArrayList<String[]> playlist2, ArrayList<String[]> playlist3){
        System.out.println("\nPlaylist 1: ");
        for(int p = 0; p<playlist1.size();p++){
            System.out.println((p+1)+" Titulo de la canción: " + playlist1.get(p)[0] + " //// Nombre del artista: " + playlist1.get(p)[1] + " //// Duracion: " + playlist1.get(p)[2] +  " //// genero: " + playlist1.get(p)[3]);

        }

        System.out.println("\nPlaylist 2: ");
        for(int p = 0; p<playlist2.size();p++){
            System.out.println((p+1)+" Titulo de la cancion: " + playlist2.get(p)[0] + " //// Nombre del artista: " + playlist2.get(p)[1] + " //// Duracion: " + playlist2.get(p)[2] + " //// genero: " + playlist2.get(p)[3]);

        }

        System.out.println("\nPlaylist 3: ");
        for(int p = 0; p<playlist3.size();p++){
            System.out.println((p+1)+" Titulo de la cancion: " + playlist3.get(p)[0] + " //// Nombre del artista: " + playlist3.get(p)[1] + " //// Duracion: " + playlist3.get(p)[2] + "//// genero: " + playlist3.get(p)[3]);
        }
    }

    public String[] SeleccionarCancion(ArrayList<String[]> playlist1, ArrayList<String[]> playlist2, ArrayList<String[]> playlist3){
        System.out.println("\nPlaylist 1: ");
        for(int p = 0; p<playlist1.size();p++){
            System.out.println((p+1)+" Titulo de la canción: " + playlist1.get(p)[0] + " //// Nombre del artista: " + playlist1.get(p)[1] + " //// Duracion: " + playlist1.get(p)[2] +  " //// genero: " + playlist1.get(p)[3]);

        }

        System.out.println("\nPlaylist 2: ");
        for(int p = 0; p<playlist2.size();p++){
            System.out.println((p+1)+" Titulo de la cancion: " + playlist2.get(p)[0] + " //// Nombre del artista: " + playlist2.get(p)[1] + " //// Duracion: " + playlist2.get(p)[2] + " //// genero: " + playlist2.get(p)[3]);

        }

        System.out.println("\nPlaylist 3: ");
        for(int p = 0; p<playlist3.size();p++){
            System.out.println((p+1)+" Titulo de la cancion: " + playlist3.get(p)[0] + " //// Nombre del artista: " + playlist3.get(p)[1] + " //// Duracion: " + playlist3.get(p)[2] + "//// genero: " + playlist3.get(p)[3]);
        }

        System.out.println("\n\nQue playlist quiere desea utilizar: ");
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
        for(int p = 0; p<playlist1.size();p++){
            System.out.println((p+1)+" Titulo de la cancion: " + pListseleccionada.get(p)[0] + " //// Nombre del artista: " + pListseleccionada.get(p)[1] + " //// Duracion: " + pListseleccionada.get(p)[2] + "//// genero: " + pListseleccionada.get(p)[3]);

        }

        System.out.println("\n\nQue cancion quiere escuchar: ");
        int g = 1;
        String csele = "";

        while(g != 0){
            csele = sc.nextLine();
            if(csele.equals("1")||csele.equals("2")||csele.equals("3")){
                g = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }


        String[] can = pListseleccionada.get(Integer.parseInt(csele)-1);

        return can;

    }

    public int menuProd(String proc) {
        System.out.println("\nLas opciones para el modo productividad son: ");
        System.out.println("\n1:" + proc+"\n2: Cerrar modo productividad");

 
        int t = 1;
        String sp ="";

        while(t !=0 ){
            sp = sc.next();
            if(sp.equals("1")||sp.equals("2")||sp.equals("3")||sp.equals("4")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }

        }
        return Integer.parseInt(sp);
    }


    public int menuRad(){
        System.out.println("\nSeleccione una opcion?: \n1: Cambiar entre FM y AM \n2: Cambiar emisora abajo (cambios -0.5)\n3: Cambiar emisora arriba (cambios +0.5)\n4: Cargar emisora\n5: Salir del modo radio");
        int t = 1;
        String srad ="";

        while(t !=0 ){
            srad = sc.next();
            if(srad.equals("1")||srad.equals("2")||srad.equals("3")||srad.equals("4")||srad.equals("5")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }
        return Integer.parseInt(srad);
    }

    public int guardarEmisora(Double emisora){
        System.out.println("\nDesea guardar la emisora?: "+emisora +"\n1: Si\n2: No\n(1--> si //// 2---> no)");
        int t = 1;
        String gemisora ="";

        while(t !=0 ){
            gemisora = sc.next();
            if(gemisora.equals("1")||gemisora.equals("2")){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }
        return Integer.parseInt(gemisora);
    }


    public Double mostrarEmisorasGuardadas(ArrayList<String> Emis){
        System.out.println("\nLas emisoras actuales son: ");
        for(int e = 0; e<Emis.size();e++){
            System.out.println((e+1)+": "+Emis.get(e)+ "\n");
        }

        System.out.println("\nQue emisora desea cargar?: ");
        int t = 1;
        String cemisora ="";

        while(t !=0 ){
            cemisora = sc.next();
            if(Double.parseDouble(cemisora)<=Emis.size() &Double.parseDouble(cemisora) > 0){
                t = 0;
            }else{
                System.out.println("\nIngrese una opción valida.");
            }
        }
        

        return Double.parseDouble(Emis.get(Integer.parseInt(cemisora)-1));
    }

    public void despedida(){
        System.out.println("Apagando radio.");
        System.out.println("Esperamos que vuelvas pornto!");
    }


}
