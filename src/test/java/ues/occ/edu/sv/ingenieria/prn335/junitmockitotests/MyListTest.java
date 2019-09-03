
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
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
       }*/
    @Test
    public void verifyNoInteractionsWithMethod(){
         List<String> mockedList= mock(MyList.class);
         verify(mockedList, times(0)).size();
    }
    
    
}
