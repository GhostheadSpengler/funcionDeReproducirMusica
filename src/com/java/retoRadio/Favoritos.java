package com.java.retoRadio;

public class Favoritos {
    public void adiciona(Audio audio){ //IMPORTANTE poner en public el metodo, ya que si no se pone, no lo podra encontrar la clase "PRINCIPAL"
        if (audio.getEvaluaciones()==3) {
            System.out.println("Buena eleccion " + audio.getNomTrack()+ " esta en el top esta temporada");
        } else{
            System.out.println(audio.getNomTrack() + " es una buena eleccion,sigue apoyando este contenido");
        }
    }
}
