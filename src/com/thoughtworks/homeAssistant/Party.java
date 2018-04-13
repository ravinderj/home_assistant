package com.thoughtworks.homeAssistant;

import java.util.ArrayList;

public class Party implements Command{
  private final ArrayList<Command> commands;

  public Party() {
    commands = new ArrayList<>();
  }

  @Override
  public void execute() {
    commands.add(new PlayMusic());
    commands.add(new SwitchOn());
    commands.add(new TurnOn());
    commands.add(new VolumeUp());
    commands.add(new VolumeUp());
    commands.add(new VolumeUp());
    commands.add(new VolumeUp());
    commands.add(new VolumeUp());
    commands.add(new VolumeUp());
    for (Command command : commands) {
      command.execute();
    }
  }

  @Override
  public void undo() {

  }
}
