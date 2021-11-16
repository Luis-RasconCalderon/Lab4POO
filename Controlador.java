public class Controlador{
    public static void main(String[] args) {
        Vista vs = new Vista();
        Radio r = new TipoA();
        int tipoRadio = vs.escogerTipoRadio();
        if(tipoRadio == 1){
            r = new TipoA();
        }else if(tipoRadio == 2){
            r = new TipoS();
        }else if(tipoRadio == 3){
            r = new TipoC();
        }

        int l = 1;
        while(l !=0){
            vs.emitirMensaje("\nEl volumen actual es: " + r.getVol());
            int m = vs.menuGeneral(r.toString());
            int modoRadio=1;
            int modoRepro=1;
            int modoTelefono =1;
           
            Double emisora = 90.0;
            final Double cambioEmisora = 0.5;
            //Modo Radio
            if(m == 1){
                while(modoRadio != 0){
                    vs.emitirMensaje("\nLa frecuencia actual es: " + r.getFrecuencia());
                    vs.emitirMensaje("\nLa emisora actual es: " + emisora);
                    int mrad = vs.menuRad();//Menu que muestra las opciones para el modo radio. Colocar un if/else if por cada opción
                    if(mrad == 1){
                        r.setFrecuencia();
                        vs.emitirMensaje("\nLa frecuencia ha cambiado a: " + r.getFrecuencia());
                    }else if(mrad == 2){
                        emisora = emisora - cambioEmisora;
                        vs.emitirMensaje("\nLa nueva emisora es: "+ emisora);
                        int g = vs.guardarEmisora(emisora);
                        if(g == 1){
                            r.setEmisora(Double.toString(emisora));
                            vs.emitirMensaje("\nSe ha guradado la emisora.");
                        }

                    }else if(mrad == 3){
                        emisora = emisora + cambioEmisora;
                        vs.emitirMensaje("\nLa nueva emisora es: "+ emisora);
                        int g = vs.guardarEmisora(emisora);
                        if(g == 1){
                            r.setEmisora(Double.toString(emisora));
                            vs.emitirMensaje("\nSe ha guradado la emisora.");
                        }
                    }else if(mrad == 4){
                        if(r.getEmisoras().size() == 0){
                            vs.emitirMensaje("\nNo hay emisoras guardadas aun.");
                        }else if(r.getEmisoras().size() != 0){
                            emisora = vs.mostrarEmisorasGuardadas(r.getEmisoras());
                            vs.emitirMensaje("\nSe ha cargado la emisora: "+ emisora);
                        }
                    }else if(mrad == 5){
                        vs.emitirMensaje("\nSaliendo del modo radio");
                        modoRadio =0;
                    }
                    
                }

            }else if( m == 2){ // Modo Reproductor
                while(modoRepro != 0){
                    int mr = vs.menuRep();//Menu que muestra las opciones para el modo reproductor. Colocar un if/else if por cada opción
                    if(mr == 1){
                        vs.mostrarPlayList(r.getPlayList1(), r.getPlayList2(), r.getPlayList3());
                    }else if(mr == 2){
                        vs.emitirMensaje(r.getCancionActual());
                    }else if(mr == 3){
                        String[] cs = vs.SeleccionarCancion(r.getPlayList1(), r.getPlayList2(), r.getPlayList3());
                        r.setCancionActual(cs);
                    }else if(mr == 4){
                        vs.emitirMensaje("\nSaliendo del modo reproductor.");
                        modoRepro =0;
                        r.setCancionActual(null);
                    }
                }
            

            }else if(m ==3){//Modo Teléfono
                vs.emitirMensaje(r.getConecTelefono());
                while(modoTelefono != 0){
                    int mt = vs.menuTele(r.toString2());//Menu que muestra las opciones para el modo telefono. Colocar un if/else if por cada opción
                        if(mt == 1){
                            vs.mostrarContactos(r.getAgenda());
                        }else if(mt == 2){
                            String[] ut = new String[2];
                            if(r.getEnLlamada() == false){
                                ut = vs.llamarContacto(r.getAgenda());
                                r.setEnLlamada();
                                r.setUltimoContacto(ut); 
                            }else{
                                vs.emitirMensaje("\nYa existe una llamada actual");
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
                vs.emitirMensaje(r.especialProd());
            }else if(m ==5){//Salir
                r.subirVol();
                

            }else if(m ==6){//Salir
                r.bajarVol();
                

            }else if(m ==7){//Salir
                vs.despedida();
                System.exit(0);

            }
        }


    }

}