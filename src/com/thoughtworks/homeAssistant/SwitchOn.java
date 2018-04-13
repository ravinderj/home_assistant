package com.thoughtworks.homeAssistant;

public class SwitchOn implements Command {
  @Override
  public void execute() {
    CircularLight circularLight = new CircularLight();
    circularLight.switchOn();
  }

  @Override
  public void undo() {
    CircularLight circularLight = new CircularLight();
    circularLight.switchOff();
  }
}
