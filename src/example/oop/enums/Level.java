package example.oop.enums;

public enum Level {
  STANDARD("Standard Level","miskin"),
  PREMIUM("Premium Level", "menengah"),
  VIP("VIP Level","bonafit");

  private String description;

  private String Note;

  Level(String description, String note){
    this.description = description;
    this.Note = note;
  }

  public String getNote(){
    return Note;
  }

  public String getDescription() {
    return description;
  }
}
