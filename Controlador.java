public class Controlador{
    public static void main(String[] args) {
        Vista vs = new Vista();
        Radio r = new TipoA();
        int tipoRadio = vs.escogerTipoRadio();
        if(tipoRadio == 1){
            r = new TipoA();
        }else if(tipoRadio == 2){
            r = new TipoC();
        }else if(tipoRadio == 3){
            r = new TipoS();
        }

        int l = 1;
        while(l !=0){
            int m = vs.escogetModo(r.toString());
            int modoRadio=1;
            int modoRepro=1;
            int modoTelefono =1;
            int modoProductividad = 1;
            //Modo Radio
            if(m == 1){
                while(modoRadio != 0){
                    int mrad = vs.menuRad(r.toString());//Menu que muestra las opciones para el modo radio. Colocar un if/else if por cada opción
                }

            }else if( m == 2){ // Modo Reproductor
                while(modoRepro != 0){
                    int mr = vs.menuRep(r.toString());//Menu que muestra las opciones para el modo reproductor. Colocar un if/else if por cada opción
                }
            

            }else if(m ==3){//Modo Teléfono
                vs.emitirMensaje(r.getConecTelefono());
                while(modoTelefono != 0){
                    int mt = vs.menuTele(r.toString());//Menu que muestra las opciones para el modo telefono. Colocar un if/else if por cada opción
                        if(mt == 1){
                            vs.mostrarContactos(r.getAgenda());
                        }else if(mt == 2){
                            String[] ut = new String[2];
                            if(r.getEnLlamada() == false){
                                ut = vs.llamarContacto(r.getAgenda());
                                r.setEnLlamada();
                                r.setUltimoContacto(ut); 
                            }
                        }else if(mt == 3){
                            vs.colgar();
                            r.setEnLlamada();
                        }else if(mt == 4){
                            vs.emitirMensaje(r.especialTelefono());
                        }else if(mt == 5){
                            modoTelefono = 0;
                            vs.emitirMensaje("\nSe ha deconectado el telefono.");
                        }
                }
                


            }else if(m == 4){//Modo Productividad
                while(modoProductividad != 0){//Adentro de este while van los if/else if que de
                    int mp  = vs.menuProd(r.toString());//Menu que muestra la opcion de ejecutar el modo productividad o salir del modo productividad
                    if(mp == 1){
                        vs.emitirMensaje(r.especialProd());
                    }else if(mp == 2){//Aqui iria la opción para salir del modo productividad
                        modoProductividad = 0;
                    }
                }


            }else if(m ==5){//Salir
                vs.despedida();
                System.exit(0);

            }
        }


    }

}