package homework54;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;


public class Playlist {

  private List<Song> songs; //List - элементы добавляются в список в определенном порядке, и этот порядок сохраняется при выполнении операций над списком.

  public Playlist() {
    songs = new ArrayList<>();
  }

  public void addSong(String name, String singer, int duration) {
    songs.add(new Song(name, singer, duration));
  }

  public void removeSong(Song song) {
    songs.remove(song);
  }

   public Object getSong(int index) {
     if (index < 0 || index >= songs.size()) {
       System.out.println("Песня не найдена");
       return null;
     }

     return songs.get(index);
   }


    public Queue<Song> getListeningQueue () {
      // LinkedList - чтобы все песни были в порядке добавления
      return new LinkedList<>(songs);
    }

  public Queue<Song> getReverseListeningQueue() {
    Queue<Song> queue = new LinkedList<>();

    for (int i = songs.size()-1; i >= 0; i--) { //Добавляем песни в очередь с конца
      queue.add(songs.get(i));
    }
    return queue;
  }


  public Queue<Song> getShuffledListeningQueue() {
    List<Song> shuffledSongs = new ArrayList<>(songs);
    Random random = new Random();

    for (int i = shuffledSongs.size() - 1; i > 0 ; i--) {
      Song temp = shuffledSongs.get(i); //копируем песню, чтобы не изменить изначальный порядок
      int j = random.nextInt(i); //случайный индекс от 0 до i
      shuffledSongs.set(i, shuffledSongs.get(j));
      shuffledSongs.set(j, temp);
    }

    return new LinkedList<>(shuffledSongs);
  }
}
/*
Используем ArrayList в методе getShuffledListeningQueue,
так как он более эффективен для получения элемента по индексу

В LinkedList элементы находятся в связанной структуре,
и для доступа к элементу по индексу
нужно пройтись по всем элементам от начала до нужного элемента.
Это требует больше времени.
 */