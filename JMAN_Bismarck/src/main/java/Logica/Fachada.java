package Logica;

import com.google.gson.JsonObject;
import java.io.IOException;

public class Fachada {


    private static Fachada instancia;
    private Partida partida;

    //singleton
    public static synchronized Fachada getInstancia() {

        if(instancia==null)
        {
            instancia=new Fachada();
        }
        return instancia;
    }

    private Fachada() {

        this.partida = new Partida();
    }

    public JsonObject CrearPartida() throws IOException {

        JsonObject respuesta = null;

        return  respuesta;

    }


}
