/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author hernandez
 */
@ExtendWith(MockitoExtension.class)
public class MyDictionaryInjectsTest {
    
    @Mock
    Map<String, String> wordMap;
    
    //cuando usamos la anotación injectmocks estamos injectando los mocks previamente hechos
    @InjectMocks
    MyDictionary dic = new MyDictionary();
    
   @Test
    public void WhenUseInjectMocksAnnotation_thencorrect(){
        
       Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");
        assertEquals("aMeaning", dic.getMeaning("aWord"));
    }
    //en esta segunda prueba pretendemos inyectar un mock a un spy de MyDictionary
    //sin embargo esto no es posible directamente 
    //lo que si podemos hacer es pasar un mock por constructor a un spy
    MyDictionary spyDic;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        spyDic = Mockito.spy(new MyDictionary(wordMap));
    }
      @Test
    public void WhenUseInjectMocksAnnotation_thencorrect2(){
        
      Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");
        assertEquals("aMeaning", dic.getMeaning("aWord"));
    }
    
}
