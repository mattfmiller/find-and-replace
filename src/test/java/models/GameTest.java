package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void findAndReplace_replaceASingleWord_y() throws Exception{
        Game testGame = new Game();
        String expected = "y";
        assertEquals(expected, testGame.findAndReplce("x", "x", "y"));
    }
}