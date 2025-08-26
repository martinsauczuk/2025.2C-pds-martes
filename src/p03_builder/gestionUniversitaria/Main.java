package p03_builder.gestionUniversitaria;

public class Main {

    public static void main(String[] args) {

        Alumno matias = new AlumnoBuilder()
                .apellido("Otero")
                .nombres("Matias Gonzalo")
                .dni("245345")
//                .declararNacionalidad("Peruana")
                .build();


        System.out.println(matias);

        // Alumno alumno = new Alumno("asf", "234234", "Matioas");


        Alumno alumno2 = new Alumno.Generador()
                .nombres("Gonzalo")
                .build();



    }
}
