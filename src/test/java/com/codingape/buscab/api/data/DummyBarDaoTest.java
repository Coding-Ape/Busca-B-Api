package com.codingape.buscab.api.data;

import com.codingape.buscab.api.model.Bar;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;



public class DummyBarDaoTest {
    private BarDao barDao = DummyBarDao.instance();



    @Test
    public void testGetBar(){
        Bar wantedBar=givenABarSavedInTheDB();
        Bar actualBar= whenIRetrieveTheBar();
        thenItsTheSameBarISaved(wantedBar, actualBar);
    }

    private void thenItsTheSameBarISaved(Bar wantedBar, Bar actualBar) {
        assertThat(actualBar).isEqualTo(wantedBar);
    }

    public Bar givenABarSavedInTheDB() {
        Bar aBar = new Bar (1, "Bar De prueba", "calle falsa 1234", 5F, "Esta Bueno");
        barDao.insert(aBar);
        return aBar;
    }

    public Bar whenIRetrieveTheBar(){
        return barDao.get(1);
    }

}
