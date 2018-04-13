package com.thoughtworks.homeAssistant;


import java.util.ArrayList;
import java.util.HashMap;

public class HomeAssistant {

  private final HashMap<String, Command> commands;
  private ArrayList<Command> previousCommands;

  public HomeAssistant() {
    this.commands = new HashMap<>();
    this.previousCommands = new ArrayList<>();

  }

  public void add(String instruction, Command command) {
    commands.put(instruction, command);
  }

  public void listen(String instruction) {
    if(instruction=="undo"){
      Command command = previousCommands.get(previousCommands.size()-1);
      command.undo();
      previousCommands.remove(command);
      return;
    }
    Command command = commands.get(instruction);
    if (command != null){
      previousCommands.add(command);
      command.execute();
      return;
    }
  }
}
