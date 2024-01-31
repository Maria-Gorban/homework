package homework54;

public class Song {
  private String name;
  private String singer;
  private int duration; //in sec

  public Song(String name, String singer, int duration) {
    this.name = name;
    this.singer = singer;
    this.duration = duration;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSinger() {
    return singer;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }

  public double getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    return String.format(singer  +
        " - " + name +
        " (%d:%02d)", (duration / 60),(duration % 60));
  }
}
