package _minute_walk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class TenMinWalkTest {
    @Test
    public void falseWhenWalkIs1Min(){
        TenMinWalk tenMinWalk = new TenMinWalk();
        String[] walk = {"W"};
        assertFalse(tenMinWalk.ten_minute_walk(walk));
    }
    @Test
    public void falseWhenWalkIs11min(){
        TenMinWalk tenMinWalk = new TenMinWalk();
        String[] walk = {"W","","","","","","","","","",""};
        assertFalse(tenMinWalk.ten_minute_walk(walk));
    }
    @Test
    public void trueWhenWalkIs10minAndGoesBackToOrigin(){
        TenMinWalk tenMinWalk = new TenMinWalk();
        String[] walk = {"W","E","W","E","W","E","W","E","W","E"};
        assertTrue(tenMinWalk.ten_minute_walk(walk));
    }
    @Test
    public void falseWhenWalkIs10minAndDoesNotGoBackToOrigin(){
        TenMinWalk tenMinWalk = new TenMinWalk();
        String[] walk = {"W","E","W","E","W","E","W","E","W","N"};
        assertFalse(tenMinWalk.ten_minute_walk(walk));
    }
    @Test
    public void falseForRandomWalk(){
        TenMinWalk tenMinWalk = new TenMinWalk();
        String[] walk = {"W","W","W","E","S","E","W","E","W","N"};
        assertFalse(tenMinWalk.ten_minute_walk(walk));
    }
    @Test
    public void trueWhenLowerCase(){
        TenMinWalk tenMinWalk = new TenMinWalk();
        String[] walk = {"w","e","W","e","W","E","w","E","W","E"};
        assertTrue(tenMinWalk.ten_minute_walk(walk));
    }
}
