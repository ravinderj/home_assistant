package com.thoughtworks.homeAssistant;


import java.util.HashMap;

public class HomeAssistant {

  private final HashMap<String, Action> actions;

  public HomeAssistant() {
    this.actions = new HashMap<>();
  }

  public void add(SquareLight squareLight) {
    actions.put("turn on light",()->squareLight.turnOn());
    actions.put("turn off light",()->squareLight.turnOff());
  }

  public void add(CircularLight circularLight) {
    actions.put("switch on light",()->circularLight.switchOn());
    actions.put("switch off light",()->circularLight.switchOff());
  }

  public void add(HomeTheatre homeTheatre) {
    actions.put("play music",()->homeTheatre.playMusic());
  }

  public void listen(String command) {
    Action action = actions.get(command);
    action.execute();
  }
}
