package homework54;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Set;

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
    Stack<Song> stack = new Stack<>();

    for (Song song : songs) {
      stack.push(song); //добавляем песни в стек
    }
    while (!stack.isEmpty()) {
      queue.add(stack.pop()); //добавляем песни в очередь из получая поочереди элементы из стека
    }
    return queue;
  }

  public Queue<Song> getShuffledListeningQueue() {
    Queue<Song> queue = new LinkedList<>();
    Set<Song> set = new HashSet<>(); //порядок не будет соответствовать хронологическому порядку добавления

    for (Song song : songs) {
      set.add(song);
    }

    Iterator<Song> iterator = set.iterator();
    while (iterator.hasNext()) {
      Song element = iterator.next();
      queue.add(element); //добавляем элементы в очередь

    }
    return queue;
  }
}
