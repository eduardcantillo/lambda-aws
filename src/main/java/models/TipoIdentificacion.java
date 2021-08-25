package models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class TipoIdentificacion {

    String id;
    String nombre;

    public TipoIdentificacion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public TipoIdentificacion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
