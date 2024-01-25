package _05_class._06_interface;

public class Mp3Player implements Music{
    private String song;

    public Mp3Player(String song) {
        this.song = song;
    }

    public void play() {
        System.out.println("MP3 플레이어에서 " + song + " 음악을 재생합니다.");
    }

    public void stop() {
        System.out.println("MP3 플레이어에서 " + song + " 음악을 정지합니다.");
    }
}
