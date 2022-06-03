import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
private List<String> crListOfStrings(String... strings){
    return new ArrayList<>(Arrays.asList(strings));
}
    @Test
    void everyStatementTestCases() {
    RuntimeException ex;
    ex = assertThrows(RuntimeException.class, () -> SILab2.function(crListOfStrings()));
    assertTrue(ex.getMessage().contains("List length should be greater than 0"));
   ex = assertThrows(RuntimeException.class, () -> SILab2.function(crListOfStrings("0","0","0","0","0","0","0","0")));
   assertTrue(ex.getMessage().contains("List length should be a perfect square"));
    assertEquals(crListOfStrings("2","#","2","#","4","#","#","#","2"),SILab2.function(crListOfStrings("0","#","0","#","0","#","#","#","0")));
    }
    @Test
    void everyBranchTestCases(){
    RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(crListOfStrings()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(crListOfStrings("0","0","0","0","0","0","0","0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        assertEquals(crListOfStrings("2","#","2","#","3","#","#","2","#"),SILab2.function(crListOfStrings("0","#","0","#","0","#","#","0","#")));
    }
}