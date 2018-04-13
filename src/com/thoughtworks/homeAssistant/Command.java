package com.thoughtworks.homeAssistant;

interface Command {
  void execute();

  void undo();
}
