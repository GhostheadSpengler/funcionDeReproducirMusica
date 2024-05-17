import com.java.retoRadio.Favoritos;
import com.java.retoRadio.Musica;
import com.java.retoRadio.Podcast;

public class Principal {
    public static void main(String[] args) {

//******************  OBJETO UNO MUSICA  ********************/

        System.out.println("      MUSICA      \n");

        Musica musica= new Musica();
        musica.setArtista("Metallica");
        musica.setAlbum("Puppeter Master");
        musica.setLanzamiento(1975);
        musica.setNumTrack(02);
        musica.setNomTrack("Puppeter Master Extend");
        musica.setReproducciones(60);
        musica.setLikes(80);

        musica.gralArt();// DE LA CLASE MUSICA
        musica.generalData(); // DE LA CLASE AUDIO
        musica.reprod();
        musica.likes();



//******************  OBJETO DOS PODCAST  ********************/

        System.out.println("\n      PODCAST      \n");

        Podcast podcast= new Podcast();
        podcast.setPodcaster("Tchulu");
        podcast.setGenero("Terror y Suspenso");
        podcast.setNumTrack(05);
        podcast.setNomTrack("Asesinos Seriales");
        podcast.setLanzamiento(2024);
        podcast.setReproducciones(100);


        podcast.gralPodcast();// DE LA CLASE PODCAST
        podcast.generalData(); //DE LA CLASE AUDIO
        // No se lleno el dato de likes porque  bajo se realizo un bucle.

//* ------->>>  BUCLE PARA LLAMAR A LOS LIKES PODCAST

        for (int i = 0; i <71 ; i++) {
            podcast.likes();
        }

        for (int i = 0; i <500 ; i++) {
            podcast.reprod();
        }
        System.out.println("Total de likes: " + podcast.getLikes());

//******************** OBJETO PARA FAVORITOS **************** /

        Favoritos favoritos= new Favoritos();
        favoritos.adiciona(musica);
        favoritos.adiciona(podcast);

    }

}