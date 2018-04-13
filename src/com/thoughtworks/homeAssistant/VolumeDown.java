package com.thoughtworks.homeAssistant;

public class VolumeDown implements Command{
  @Override
  public void execute() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeDown();
  }

  @Override
  public void undo() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeUp();
  }
}
