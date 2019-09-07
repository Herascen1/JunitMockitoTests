
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;

import java.util.List;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MathUtilsTestCaptor {
    @Test
    void test(){
        MathUtils mockMathUtils = mock(MathUtils.class);
        when(mockMathUtils.add(1, 1)).thenReturn(2);
        when(mockMathUtils.isInteger(anyString())).thenReturn(true);
        
        ArgumentCaptor acInteger = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor acString = ArgumentCaptor.forClass(String.class);
        
        assertEquals(2, mockMathUtils.add(1, 1));
        assertTrue(mockMathUtils.isInteger("99"));
        assertTrue(mockMathUtils.isInteger("9"));
        Mockito.verify(mockMathUtils).add((Integer)acInteger.capture(), (Integer) acInteger.capture());
        List allValues = acInteger.getAllValues();
        assertEquals(List.of(1,1), allValues);
        verify(mockMathUtils, times(2)).isInteger((String)acString.capture());
        List allStringValues  = acString.getAllValues();
        assertEquals(List.of("99","9"),allStringValues);
    }
    
}
