package learn;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyPluginTest
{
    @Test
    public void testSomething()
    {
        Integer integer = new MyPlugin().shouldFailOnce();
        assertThat(integer, not(nullValue()));
    }
}
