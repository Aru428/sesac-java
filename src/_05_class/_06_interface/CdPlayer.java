package _05_class._06_interface;

public class CdPlayer implements Music{
    private String album;

    public CdPlayer(String album) {
        this.album = album;
    }

    public void play() {
        System.out.println("CD 플레이어에서 " + album + " 앨범을 재생합니다.");
    }

    public void stop() {
        System.out.println("CD 플레이어에서 " + album + " 앨범을 정지합니다.");
    }
}
