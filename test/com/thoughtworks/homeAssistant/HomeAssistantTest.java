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
    SquareLight squareLight = mock(SquareLight.class);
    homeAssistant.add(squareLight);
    homeAssistant.listen("turn on light");
    verify(squareLight).turnOn();
  }
  @Test
  public void shouldTurnOffTheLightBulb() {
    SquareLight squareLight = mock(SquareLight.class);
    homeAssistant.add(squareLight);
    homeAssistant.listen("turn off light");
    verify(squareLight).turnOff();
  }

  @Test
  public void shouldSwitchOnCircleLight() {
    CircularLight circularLight = mock(CircularLight.class);
    homeAssistant.add(circularLight);
    homeAssistant.listen("switch on light");
    verify(circularLight).switchOn();
  }

  @Test
  public void shouldSwitchOffCircleLight() {
    CircularLight circularLight = mock(CircularLight.class);
    homeAssistant.add(circularLight);
    homeAssistant.listen("switch off light");
    verify(circularLight).switchOff();
  }

  @Test
  public void shouldPlayMusic() {
    HomeTheatre homeTheatre = mock(HomeTheatre.class);
    homeAssistant.add(homeTheatre);
    homeAssistant.listen("play music");
    verify(homeTheatre).playMusic();
  }
}
