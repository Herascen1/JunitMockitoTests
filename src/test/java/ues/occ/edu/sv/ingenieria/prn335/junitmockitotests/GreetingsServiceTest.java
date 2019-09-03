/*
este es un test en el que probamos la funcionalidad de la anotación spy la cual nos sirve para burlarnos parcialmente de una 
funcionalidad de nuestro objeto 
 */
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;

import java.time.LocalTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Mauricio
 */
@ExtendWith(MockitoExtension.class)
public class GreetingsServiceTest {
  
      @Test
      public void testGetGreetings_mornign() throws Exception{
          // especificando el comportamiento del mock
          
          UserService userService =  Mockito.mock(UserService.class);
          AppService appService =  Mockito.spy(AppServiceImpl.class);
          GreetingsService greetingService = new GreetingsService(userService, appService);
          when(userService.getFirstName(99)).thenReturn("John");
          when(userService.getLastName(99)).thenReturn("Doe");
          //invocando el método bajo test
          String greetings = greetingService.getGreetings(99, LocalTime.of(0, 45));
          Assert.assertEquals("Failed to get greetings!", "Good Morning, John Doe! Welcome to The Amazing Application.", greetings);
      }
       @Test
    public void testGetGreetings_afternoon() throws Exception {
        // specify mocked behavior
       
        UserService userService =  Mockito.mock(UserService.class);
        AppService appService =  Mockito.spy(AppServiceImpl.class);
        GreetingsService greetingService = new GreetingsService(userService, appService);
        when(userService.getFirstName(11)).thenReturn("Jane");
        when(userService.getLastName(11)).thenReturn("Doe");
        // invoke method under test
        String greetings = greetingService.getGreetings(11, LocalTime.of(13, 15));
        Assert.assertEquals("Failed to get greetings!", "Good Afternoon, Jane Doe! Welcome to The Amazing Application.", greetings);
    }
}
