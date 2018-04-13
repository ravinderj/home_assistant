package com.thoughtworks.homeAssistant;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;


public class HomeTheatreTest {

  @Test
  public void shouldPlayMusic() {
    HomeTheatre homeTheatre = new HomeTheatre();
    assertTrue(homeTheatre.playMusic());
  }

  @Test
  public void shouldIncreaseVolume() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeUp();
    assertThat(homeTheatre).extracting("volume").contains(1);
  }

  @Test
  public void shouldNotIncreaseAfter5() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeUp();
    homeTheatre.volumeUp();
    homeTheatre.volumeUp();
    homeTheatre.volumeUp();
    homeTheatre.volumeUp();
    assertThat(homeTheatre).extracting("volume").contains(5);
    homeTheatre.volumeUp();
    homeTheatre.volumeUp();
    assertThat(homeTheatre).extracting("volume").contains(5);

  }

  @Test
  public void shouldDecreaseVolume() {
    HomeTheatre homeTheatre = new HomeTheatre();
    homeTheatre.volumeUp();
    homeTheatre.volumeUp();
    homeTheatre.volumeDown();
    assertThat(homeTheatre).extracting("volume").contains(1);
  }

  @Test
  public void shouldNotDecreaseVolumeLessThanZero() {
    HomeTheatre homeTheatre = new HomeTheatre();
    assertThat(homeTheatre).extracting("volume").contains(0);
    homeTheatre.volumeDown();
    assertThat(homeTheatre).extracting("volume").contains(0);
  }
}