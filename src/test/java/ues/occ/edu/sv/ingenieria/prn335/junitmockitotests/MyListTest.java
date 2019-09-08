
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;
/**/
@ExtendWith(MockitoExtension.class)
public class MyListTest {
    
    
    /*@Test
    public void testingArray(){
        MyList MockedList = Mockito.mock(MyList.class);
        MockedList.size();
        Mockito.verify(MockedList).size();
        
        
        
        
    }
//verify number of interactions with mock
    @Test
    public void testingNumberofInteractions(){
   List<String> mockedList= mock(MyList.class);
    mockedList.size();
    verify(mockedList, times(1)).size();
    }
       @Test
       public void verifyNoInteractionsWholeMock(){
           List<String> mockedList= mock(MyList.class);
           verifyZeroInteractions(mockedList);
       }
    @Test
    public void verifyNoInteractionsWithMethod(){
         List<String> mockedList= mock(MyList.class);
         verify(mockedList, times(0)).size();
    }
    
     @Test 
     public void verifyNoUnexpectedInteractions(){
         List<String> mockedList = mock(MyList.class);
         mockedList.size();
         mockedList.clear();
         verify(mockedList).size();
         verifyNoMoreInteractions(mockedList);
     }

    @Test 
    public void verifyOrderOfInteractions(){
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        mockedList.add("aString");
        mockedList.clear();
        
        InOrder inOrder = Mockito.inOrder(mockedList);
        inOrder.verify(mockedList).size();
        inOrder.verify(mockedList).add("aString");
        inOrder.verify(mockedList).clear();
       
       
        
    }
  
    @Test 
    public void verifyInteractionNotOcurred(){
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        verify(mockedList, never()).clear();
    }
 */
    @Test
    public void verifyMinumumMaximumOfTimes(){
    List<String> mockedList = mock(MyList.class);
    mockedList.clear();
    mockedList.clear();
    mockedList.clear();
    
    verify(mockedList, atMost(5)).clear();
    verify(mockedList, atLeast(1)).clear();
    
    }
}
