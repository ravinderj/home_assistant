package com.thoughtworks.homeAssistant;

public class SwitchOff implements Command{
  @Override
  public void execute() {
    CircularLight circularLight = new CircularLight();
    circularLight.switchOff();
  }

  @Override
  public void undo() {
    CircularLight circularLight = new CircularLight();
    circularLight.switchOn();
  }
}
