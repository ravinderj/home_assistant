package com.thoughtworks.homeAssistant;

public class VolumeUp implements Command{
  @Override
  public void execute() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeUp();
  }

  @Override
  public void undo() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeDown();
  }
}
