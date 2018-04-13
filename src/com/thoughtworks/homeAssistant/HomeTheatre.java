package com.thoughtworks.homeAssistant;

public class HomeTheatre {
  private int volume;

  public HomeTheatre() {
    this.volume = 0;
  }

  public boolean playMusic() {
    return true;
  }

  public void volumeUp() {
    if(this.volume<5) {
      this.volume = volume+1;
    }
  }

  public void volumeDown() {
    if(this.volume>0) {
      this.volume = volume-1;
    }
  }
}
