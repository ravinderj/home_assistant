package com.thoughtworks.homeAssistant;


public class HomeAssistant {

  private SquareLight squareSquareLight;
  private CircularLight circularLight;
  private HomeTheatre homeTheatre;

  public HomeAssistant() {

  }

  public void addSquareLight(SquareLight squareLight) {
    this.squareSquareLight = squareLight;
  }

  public void addCircularLight(CircularLight light) {
    this.circularLight = light;
  }

  public void addHomeTheatre(HomeTheatre homeTheatre) {
    this.homeTheatre = homeTheatre;
  }

  public void listen(Instructions command) {
    if (command.equals(Instructions.TURN_ON_LIGHT)) {
      squareSquareLight.turnOn();
    }
    else if(command.equals(Instructions.TURN_OFF)){
      squareSquareLight.turnOff();
    }
    else if(command.equals(Instructions.SWITCH_ON_LIGHT)) {
      circularLight.switchOn();
    }
    else if(command.equals(Instructions.SWITCH_OFF_LIGHT)) {
      circularLight.switchOff();
    }
    else if(command.equals(Instructions.PLAY_MUSIC)) {
      homeTheatre.playMusic();
    }
  }

}
