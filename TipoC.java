public class TipoC extends Radio {
    private boolean enEspera;
    public TipoC(){
        String[] contacto1 = {"Alfredo","56874852"};
        String[] contacto2 = {"Maria","87945654"};
        String[] contacto3 = {"Carlos","78784516"};

        agenda.add(contacto1);
        agenda.add(contacto2);
        agenda.add(contacto3);

        enEspera = false;
    }


    @Override
    public String especialProd() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String especialTelefono() {
        String esp = "";
        if(enLlamada == true & enEspera == false){
            esp = "Se ha colocado la llamada en espera";
        }else if(enLlamada == false || enEspera == true){
            esp = "No se puede colocar llamada en espera. No existe llamada activa o ya hay una en espera";
        }
        return esp;
    }

    @Override
    public String toString(){
        return "\n4: Poner llamada en espera.";
    }
    
}
