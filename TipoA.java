public class TipoA extends Radio {

    public TipoA(){
        String[] contacto1 = {"Luis","49874565"};
        String[] contacto2 = {"Nirvana","78986523"};
        String[] contacto3 = {"Kevin","42515623"};

        agenda.add(contacto1);
        agenda.add(contacto2);
        agenda.add(contacto3);
    }

    @Override
    public String especialProd() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String especialTelefono() {
        // TODO Auto-generated method stub
        return "Se esta llamando nuevamente al contacto: "+ UltimoContacto[0] + " con el numero: " + UltimoContacto[1];
    }
    

    @Override
    public String toString(){
        return "\n4: Llamar al último contacto";
    }



}
