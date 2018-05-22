package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void findAndReplace_replaceWordInSingleWordSentence_y() throws Exception{
        Game testGame = new Game();
        String expected = "y";
        assertEquals(expected, testGame.findAndReplce("x", "x", "y"));
    }

    @Test
    public void findAndReplace_replaceWordInMultiWordSentence_yghu() throws Exception{
        Game testGame = new Game();
        String expected = "y g h u";
        assertEquals(expected, testGame.findAndReplce("x g h u", "x", "y"));
    }
}