package cwicz1do30.CWICZ16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void sumArrays() {
        //given
        ArrayUtils utils = new ArrayUtils();
        int[] tab1 = {1, 3, 6};
        int[] tab2 = {12, 34, 53};

        //when
        int result = utils.sumArrays(tab1, tab2);

        //then
        Assertions.assertEquals(109, result);
    }

    @Test
    void sumArray() {
        //given
        ArrayUtils utils = new ArrayUtils();
        int[] tab1 = {1, 3, 6};

        //when
        int result = utils.sumArray(tab1);

        //then
        Assertions.assertEquals(10, result);

    }
}