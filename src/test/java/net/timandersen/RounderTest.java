package net.timandersen;


import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

public class RounderTest  {

    private final Rounder rounder = new Rounder();

    @Test
    public void shouldRound123ToNearestHundred() {
        assertThat(rounder.roundToNearestHundred(123), is(100));
    }
    @Test
    public void shouldRound184ToNearestHundred() {
        assertThat(rounder.roundToNearestHundred(184), is(200));
    }

    @Test
    public void shouldRound667ToNearestHundred() {
        assertThat(rounder.roundToNearestHundred(667), is(700));
    }

    @Test
    public void shouldRound456ToNearestHundred() {
        assertThat(rounder.roundToNearestHundred(456), is(500));
    }


}
