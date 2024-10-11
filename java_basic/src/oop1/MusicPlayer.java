package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean ison = false;

    void on() {
        ison = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        ison = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("volume = " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("volume = " + volume);
    }

    void showStatus() {
        if (ison) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
