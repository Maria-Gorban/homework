package homework54;

import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void listenPlaylist(Playlist playlist, int i) {

    Queue<Song> queue = null;
    switch (i) {
      case 1:
        queue = playlist.getListeningQueue();
        break;
      case 2:
        queue = playlist.getReverseListeningQueue();
        break;
      case 3:
        queue = playlist.getShuffledListeningQueue();
        break;
      case 0:
        return;
    }
    while (!queue.isEmpty()) {
      Song song = queue.poll();
      System.out.println("Играет песня: " + song);

    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Playlist playlist = new Playlist();

    playlist.addSong("Alors on dance", "Stromae", 206);
    playlist.addSong("Sonne", "Rammstein", 272);
    playlist.addSong("Toxic", "Britney Spears", 198);
    playlist.addSong("Radioactive", "Imagine Dragons", 186);
    playlist.addSong("Somebody That I Used To Know", "Gotye, Kimbra", 244);
    playlist.addSong("Судно", "Молчат Дома", 141);


    int userChoice;
    do {
      System.out.println(
          "\nВыберите функцию: \n1 - воспроизвести плейлист \n2 - воспроизвести плейлист с конца \n3 - перемешать плейлист \n0 - выйти");
      userChoice = scanner.nextInt();
      listenPlaylist(playlist, userChoice);
      //System.out.println(playlist.getSong(5)); чисто ради проверки того, что в самом плейлисте не меняется порядок песен
    }while(userChoice != 0);

    }
  }




