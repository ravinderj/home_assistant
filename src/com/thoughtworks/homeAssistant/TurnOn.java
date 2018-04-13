package com.thoughtworks.homeAssistant;

public class TurnOn implements Command {

  @Override
  public void execute() {
    SquareLight squareLight = new SquareLight();
    squareLight.turnOn();
  }

  @Override
  public void undo() {
    new TurnOff().execute();
  }
}
