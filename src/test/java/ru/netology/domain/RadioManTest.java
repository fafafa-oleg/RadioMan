package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioManTest {

    RadioMan radioMan = new RadioMan();

    @Test
    void shouldnextStation15() {
        radioMan.setMaxNumberstation(15);
        radioMan.next(15);
        assertEquals(0,radioMan.getCurrentNumberstation());
    }

    @Test
    void shouldnextStation7() {
        radioMan.next(7);
        assertEquals(8,radioMan.getCurrentNumberstation());
    }

    @Test
    void shouldprevStation0() {
        radioMan.prev(0);
        assertEquals(10,radioMan.getCurrentNumberstation());
    }

    @Test
    void shouldprevStation5() {
        radioMan.prev(5);
        assertEquals(4,radioMan.getCurrentNumberstation());
    }

    @Test
    void shoulEnverRadioStation() {
        radioMan.EnverRadioStation(10);
        assertEquals(0,radioMan.getCurrentNumberstation());
    }

    @Test
    void shoulEnverRadioStation5() {
        radioMan.EnverRadioStation(5);
        assertEquals(5,radioMan.getCurrentNumberstation());
    }

    @Test
    void shoulEnverRadioStation0() {
        radioMan.EnverRadioStation(0);
        assertEquals(10,radioMan.getCurrentNumberstation());
    }

    @Test
    void shouldVolume10() {
        radioMan.nextVolume(10);
        assertEquals(11,radioMan.getCurrentVolume());
    }

    @Test
    void shouldVolume0() {
        radioMan.prevVolume(0);
        assertEquals(0,radioMan.getCurrentVolume());
    }

    @Test
    void shouldVolume100() {
        radioMan.nextVolume(100);
        assertEquals(100,radioMan.getCurrentVolume());
    }

}