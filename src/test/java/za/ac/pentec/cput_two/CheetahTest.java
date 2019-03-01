package za.ac.pentec.cput_two;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

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
}