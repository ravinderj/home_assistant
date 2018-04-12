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
    homeAssistant.addSquareLight(squareLight);
    homeAssistant.listen(Instructions.TURN_ON_LIGHT);
    verify(squareLight).turnOn();
  }
  @Test
  public void shouldTurnOffTheLightBulb() {
    SquareLight squareLight = mock(SquareLight.class);
    homeAssistant.addSquareLight(squareLight);
    homeAssistant.listen(Instructions.TURN_OFF);
    verify(squareLight).turnOff();
  }

  @Test
  public void shouldSwitchOnCircleLight() {
    CircularLight circularLight = mock(CircularLight.class);
    homeAssistant.addCircularLight(circularLight);
    homeAssistant.listen(Instructions.SWITCH_ON_LIGHT);
    verify(circularLight).switchOn();
  }

  @Test
  public void shouldSwitchOffCircleLight() {
    CircularLight circularLight = mock(CircularLight.class);
    homeAssistant.addCircularLight(circularLight);
    homeAssistant.listen(Instructions.SWITCH_OFF_LIGHT);
    verify(circularLight).switchOff();
  }

  @Test
  public void shouldPlayMusic() {
    HomeTheatre homeTheatre = mock(HomeTheatre.class);
    homeAssistant.addHomeTheatre(homeTheatre);
    homeAssistant.listen(Instructions.PLAY_MUSIC);
    verify(homeTheatre).playMusic();
  }
}
