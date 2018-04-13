package com.thoughtworks.homeAssistant;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class PartyTest {

  @Test
  public void execute() {
    Party party = new Party();
    party.execute();
    HomeTheatre mockHomeTheatre = mock(HomeTheatre.class);

  }
}