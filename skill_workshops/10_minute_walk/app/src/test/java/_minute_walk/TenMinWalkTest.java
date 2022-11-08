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
}
