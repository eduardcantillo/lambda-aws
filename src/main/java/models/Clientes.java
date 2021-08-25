package models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "clientes")
public class Clientes {

    @DynamoDBAttribute
    private String nombre;

    @DynamoDBAttribute
    private String apellidos;

    @DynamoDBHashKey
    private String identificacion;

    @DynamoDBAttribute
    private Integer edad;

    @DynamoDBAttribute
    private String ciudad;

    @DynamoDBAttribute
    private TipoIdentificacion tipo;

    public Clientes(String nombre, String apellidos, String identificacion, Integer edad, String ciudad, TipoIdentificacion tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.edad = edad;
        this.ciudad = ciudad;
        this.tipo = tipo;
    }

    public Clientes() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public TipoIdentificacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoIdentificacion tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
}
