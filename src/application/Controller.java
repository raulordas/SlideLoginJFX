package application;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller {
	
	@FXML
	MediaView videoPane;
	
	public void initialize() {
		animacionVideo();
	}
	
	public void animacionVideo() {
		Media media1= new Media(getClass().getResource("assets/skivideo.mp4").toExternalForm());
        MediaPlayer player=new MediaPlayer(media1);
        videoPane.setMediaPlayer(player);
        player.setVolume(0.5);
        player.play();
	}
}
