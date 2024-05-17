package com.java.retoRadio;
public class Musica extends Audio{

    //******************  DECLARANDO VARIABLES  ********************/

    private String artista;
    private String album;

//******************  GETTERS & SETTERS  ********************/


    public void setArtista(String artista) {
        this.artista = artista;
    }


    public void setAlbum(String album) {
        this.album = album;
    }


    //*********************** SE LLAMA AL METODO DE EVALUACION  ******************/
    @Override
    public int getEvaluaciones() {
        if(getLikes()>=70){
            return 3;
        }else{
            return 1;
        }
    } //Si los likes son mayores o iguales a 70, getReturn devolvera 3, de lo contrario devolvera UNO. (Revisar clase FAVORITOS)

    //******************  METODO GRAL ARTISTA  ********************/

public void gralArt(){
    System.out.println(" Artista : " + artista);
    System.out.println("Album: " + album);
}
}