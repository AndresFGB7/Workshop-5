package resources.pojos;

import java.util.Comparator;

public class ComparatorLocation implements Comparator<Owner> {
    @Override
    public int compare(Owner o1, Owner o2) {
        if (o1.getNeighborhood().compareTo(o2.getNeighborhood()) > 0) {
            return 1;
        }
        else if (o1.getNeighborhood().compareTo(o2.getNeighborhood()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
