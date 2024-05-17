
package com.java.retoRadio;

public class Audio {

//**************** DECLARANDO VARIABLES ******************/
    private String nomTrack;
    private int numTrack;
    private int duracionTrack;
    private  int likes;
    private int reproducciones;
    private int lanzamiento;
    private int evaluaciones;


//******************  GETTERS & SETTERS  ********************/


    public String getNomTrack() {
        return nomTrack;
    }

    public void setNomTrack(String nomTrack) {
        this.nomTrack = nomTrack;
    }

    public int getNumTrack() {
        return numTrack;
    }

    public void setNumTrack(int numTrack) {
        this.numTrack = numTrack;
    }

    public int getDuracionTrack() {
        return duracionTrack;
    }

    public void setDuracionTrack(int duracionTrack) {
        this.duracionTrack = duracionTrack;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;

    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }


    //*******NOTA: METODO PARA EVALUCIONES. Se hereda a los hijos podcast/audio *******/
    public int getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(int evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    //******************  METODO DE LIKES Y REPRODUCCIONES  ********************/
    public void likes() {
        this.likes++;
    }

    public void reprod(){
        this.reproducciones++;
    }


//******************  METODO DATOS EN GRAL   ********************/

    public void generalData(){
        System.out.println("Nombre Pista:" + nomTrack);
        System.out.println("Fecha de lanzamiento: " + lanzamiento);
        System.out.println("Numero Pista:" + numTrack);
        System.out.println("Numero de reproducciones:" + reproducciones);
        System.out.println("Total de likes:" + likes);
    }
}