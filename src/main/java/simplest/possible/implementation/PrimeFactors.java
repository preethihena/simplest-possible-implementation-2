package simplest.possible.implementation;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {

    public List<Integer> of(int  number) {

        List<Integer> primeFactorsList = new ArrayList<Integer>();
        if(isOneOrTwo(number, 1))
            return Collections.emptyList();
        if(isOneOrTwo(number, 2))
            primeFactorsList.add(2);

        return primeFactorsList;

    }

    private boolean isOneOrTwo(int number, int i) {
        return number == i;
    }


}
