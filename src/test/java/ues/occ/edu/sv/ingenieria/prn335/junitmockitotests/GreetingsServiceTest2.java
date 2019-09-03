/*
this test fails because of nullpointer exception id don´t know what the problem is
 */
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;
import java.time.LocalTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.*;

public class GreetingsServiceTest2 {
    @Mock
    private UserService userService; // this class will be mocked
    @Spy
    private AppService appService= new AppServiceImpl(); // this class WON'T be mocked
    @InjectMocks
    private GreetingsService greetingsService = new GreetingsService(userService, appService);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetGreetings_morning() throws Exception {
        // specify mocked behavior
        when(userService.getFirstName(99)).thenReturn("John");
        when(userService.getLastName(99)).thenReturn("Doe");
        // invoke method under test
        String greetings = greetingsService.getGreetings(99, LocalTime.of(0, 45));
        Assert.assertEquals("Failed to get greetings!", "Good Morning, John Doe! Welcome to The Amazing Application.", greetings);
    }

    @Test
    public void testGetGreetings_afternoon() throws Exception {
        // specify mocked behavior
        when(userService.getFirstName(11)).thenReturn("Jane");
        when(userService.getLastName(11)).thenReturn("Doe");
        // invoke method under test
        String greetings = greetingsService.getGreetings(11, LocalTime.of(13, 15));
        Assert.assertEquals("Failed to get greetings!", "Good Afternoon, Jane Doe! Welcome to The Amazing Application.", greetings);
    }
}
