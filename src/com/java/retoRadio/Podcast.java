package com.java.retoRadio;
public class Podcast extends Audio {

    //******************  DECLARANDO VARIABLES  ********************/

    private String podcaster;
    private String genero;


//******************  GETTER & SETTERS  ********************/

    public String getPodcaster() {
        return podcaster;
    }

    public void setPodcaster(String podcaster) {
        this.podcaster = podcaster;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //*********************** SE LLAMA AL METODO DE EVALUACION  ******************/
    @Override //Se utiliza (SOBREESCRIBE) el metodo Evaluaciones de AUDIO
    public int getEvaluaciones() {
        if(getLikes()>=90){
            return 3;
        } else{
            return 1;
        }
    }

//******************  METODO GRAL PODCAST  ********************/

    public void gralPodcast(){
        System.out.println("Podcaster:" + podcaster);
        System.out.println("Genero Canal " + genero);
    }
}