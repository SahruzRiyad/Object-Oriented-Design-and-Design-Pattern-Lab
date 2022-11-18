public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Chiro odhora.mp3");
        audioPlayer.play("vlc", "Tor premete ondho.vlc");
        audioPlayer.play("mp4", "Amar deho khan.mp4");
        audioPlayer.play("avi","mind me.avi");
    }
}
