package net.timandersen;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RounderTest {

    private final Rounder rounder = new Rounder();

    @Test
    public void shouldRoundToNearestHundred() {
        assertRounding(123, 100);
        assertRounding(150, 200);
        assertRounding(199, 200);
        assertRounding(201, 200);
        assertRounding(249, 200);
        assertRounding(291, 300);
        assertRounding(300, 300);
        assertRounding(351, 400);
        assertRounding(444, 400);
        assertRounding(487, 500);
        assertRounding(505, 500);
        assertRounding(537, 500);
        assertRounding(551, 600);
        assertRounding(639, 600);
        assertRounding(693, 700);
        assertRounding(984, 1000);
    }

    private void assertRounding(int number, int rounded) {
        assertThat(rounder.roundToNearestHundred(number), is(rounded));
    }


}
