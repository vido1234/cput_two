package za.ac.pentec.cput_two;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheetahTest {

    Cheetah cheetah;
    @Before
    public void setUp() throws Exception {
        cheetah = new Cheetah();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMap() {
        Map map = cheetah.getMap();
        Assert.assertEquals(cheetah.getMap(),map);
    }

    @Test
    public void getSet() {
        Set set = cheetah.getSet();
        Assert.assertEquals(cheetah.getSet(),set);
    }

    @Test
    public void getList() {
        List list = cheetah.getList();
        Assert.assertEquals(cheetah.getList(),"");
    }

    @Test
    public void getCollection() {
        Collection collection = cheetah.getCollection();
        Assert.assertEquals(cheetah.getCollection(),"");
    }

    @Test
    public void getSound(){
        String sound = cheetah.getSound();
        Assert.assertEquals(cheetah.getSound(),sound);

    }
    @Test
    public void hasWiskers(){
        boolean wisker = cheetah.hasWiskers();
        Assert.assertEquals(cheetah.hasWiskers(),wisker);
    }
    @Test
    public void isBigCat(){
        boolean bigCat = cheetah.isBigCat();
        Assert.assertEquals(cheetah.isBigCat(),bigCat);
    }
    @Test
    public void move(){
        String move = cheetah.move();
        Assert.assertEquals(cheetah.move(),move);
    }
    @Test
    public void hasFourLegs(){
        boolean hasFourLegs = cheetah.hasFourLegs();
        Assert.assertEquals(cheetah.hasFourLegs(),hasFourLegs);
    }
    @Test
    public void eat(){
        String eat = cheetah.eat();
        Assert.assertEquals(cheetah.eat(),eat);
    }
}