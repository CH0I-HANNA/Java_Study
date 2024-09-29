package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData(); //객체 생성
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showState(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.ison = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.ison = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("volume = " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("volume = " + data.volume);
    }

    static void showState(MusicPlayerData data) {
        if (data.ison) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
