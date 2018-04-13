package com.thoughtworks.homeAssistant;


import javax.swing.*;
import java.util.HashMap;

public class HomeAssistant {

  private final HashMap<String, Action> actions;
  private SquareLight squareSquareLight;
  private CircularLight circularLight;
  private HomeTheatre homeTheatre;

  public HomeAssistant() {
    this.actions = new HashMap<>();
  }

  public void add(SquareLight squareLight) {
    actions.put("turn on light",()=>);
  }

  public void add(CircularLight light) {
    this.circularLight = light;
  }

  public void add(HomeTheatre homeTheatre) {
    this.homeTheatre = homeTheatre;
  }

  public void listen(String command) {
    if (command.equals("turn on light")) {
      squareSquareLight.turnOn();
    }
    else if(command.equals("turn off light")){
      squareSquareLight.turnOff();
    }
    else if(command.equals("switch on light")) {
      circularLight.switchOn();
    }
    else if(command.equals("switch off light")) {
      circularLight.switchOff();
    }
    else if(command.equals("play music")) {
      homeTheatre.playMusic();
    }
  }

}
