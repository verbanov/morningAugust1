package org.old;

public class SongOrder {
  private String singer;
  private String songName;

  private SongOrder(String singer) {
    this.singer = singer;
  }

  private SongOrder(String singer, String songName) {
    this.singer = singer;
    this.songName = songName;
  }

  public static SongOrder of(String singer) {
    return new SongOrder(singer);
  }

  public static SongOrder of(String singer, String songName) {
    return new SongOrder(singer, songName);
  }

  @Override
  public String toString() {
    if (this.singer != null && this.songName != null) {
      return "Play " + this.singer + " song called \"" + this.songName + "\"";
    } else if (this.singer != null && this.songName == null) {
      return "Play any " + this.singer + " song";
    }
    return "You haven't chosen a singer. Please make your choice)";
  }
}
