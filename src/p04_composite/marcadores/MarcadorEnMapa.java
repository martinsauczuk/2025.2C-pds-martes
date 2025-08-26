package p04_composite.marcadores;

public interface MarcadorEnMapa {

    float lat();
    float lng();

    String descripcion();

    int cantEstrellas();

    void setHorario(String horario);

}
