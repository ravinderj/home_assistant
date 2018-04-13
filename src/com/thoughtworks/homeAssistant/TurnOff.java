package com.thoughtworks.homeAssistant;

public class TurnOff implements Command{

  @Override
  public void execute() {
    SquareLight squareLight = new SquareLight();
    squareLight.turnOff();
  }

  @Override
  public void undo() {
    SquareLight squareLight = new SquareLight();
    squareLight.turnOn();
  }
}
