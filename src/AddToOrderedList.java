import java.util.LinkedList;
import java.util.ListIterator;

public class TRAI_22_X3_dankurhi implements TRAI_22_X3 {
    
    public <E extends Comparable<? super E>> void lisaaUudet(LinkedList<E> A, LinkedList<E> B) {

        // TODO

        ListIterator<E> iteratorA = A.listIterator();
        ListIterator<E> iteratorB = B.listIterator();
        E iteraattorinAarvo = iteratorA.next();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            E iteraattorinBarvo = iteratorB.next();
            int vertaus = iteraattorinAarvo.compareTo(iteraattorinBarvo);
            if (vertaus == 0) {
                continue;
            }
            else if (vertaus < 0) {
                A.add(iteraattorinBarvo);
            }
            else {
                A.add(iteraattorinBarvo);
            }
        }
    }
}