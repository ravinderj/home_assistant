package com.thoughtworks.homeAssistant;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class HomeAssistantTest {

  private HomeAssistant homeAssistant;

  @Before
  public void setUp() {
    homeAssistant = new HomeAssistant();
  }

  @Test
  public void shouldTurnOnTheLightBulb() {
    Command turnOn = mock(TurnOn.class);
    homeAssistant.add("turn on light", turnOn);
    homeAssistant.listen("turn on light");
    verify(turnOn).execute();
  }
  @Test
  public void shouldTurnOffTheLightBulb() {
    Command turnOff = mock(TurnOff.class);
    homeAssistant.add("turn off light", turnOff);
    homeAssistant.listen("turn off light");
    verify(turnOff).execute();
  }

  @Test
  public void shouldSwitchOnCircleLight() {
    Command switchOn = mock(SwitchOn.class);
    homeAssistant.add("switch on light", switchOn);
    homeAssistant.listen("switch on light");
    verify(switchOn).execute();
  }

  @Test
  public void shouldSwitchOffCircleLight(){
    Command switchOff = mock(SwitchOff.class);
    homeAssistant.add("switch off light", switchOff);
    homeAssistant.listen("switch off light");
    verify(switchOff).execute();
  }

  @Test
  public void shouldPlayMusic() {
    Command playMusic = mock(PlayMusic.class);
    homeAssistant.add("play music", playMusic);
    homeAssistant.listen("play music");
    verify(playMusic).execute();
  }

  @Test
  public void shouldIncreaseVolumeOfHomeTheatre() {
    Command volumeUp = mock(VolumeUp.class);
    homeAssistant.add("volume up", volumeUp);
    homeAssistant.listen("volume up");
    verify(volumeUp).execute();
  }
  @Test
  public void shouldDecreaseVolumeOfHomeTheatre() {
    Command volumeDown = mock(VolumeDown.class);
    homeAssistant.add("volume down", volumeDown);
    homeAssistant.listen("volume down");
    verify(volumeDown).execute();
  }

  @Test
  public void shouldIncreaseMaxVolumeAndTurnOnAllTheLightsForParty() {
    Command party = mock(Party.class);
    homeAssistant.add("party",party);
    homeAssistant.listen("party");
    verify(party).execute();
  }

  @Test
  public void shouldNotDoAnyThingIfCommandIsNotAvailable() {
    homeAssistant.listen("Don't do anything");
  }

  @Test
  public void shouldBeAbleUndoTheCommand() {
    Command turnOn = mock(TurnOn.class);
    Command switchOff = mock(SwitchOff.class);
    homeAssistant.add("switch off light", switchOff);
    homeAssistant.add("turn on light", turnOn);
    homeAssistant.listen("turn on light");
    verify(turnOn).execute();
    homeAssistant.listen("switch off light");
    verify(switchOff).execute();
    homeAssistant.listen("undo");
    verify(switchOff).undo();
    homeAssistant.listen("undo");
    verify(turnOn).undo();
  }
}
