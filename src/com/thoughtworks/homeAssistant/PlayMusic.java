package com.thoughtworks.homeAssistant;

public class PlayMusic implements  Command{
  @Override
  public void execute() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.playMusic();
  }

  @Override
  public void undo() {

  }
}
