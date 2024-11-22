public class GenerickySeznam<TYP>
{
    private Uzel first;
    private Uzel last;
    private int size;

    public GenerickySeznam() {
        this.size = 0;
    }

    public void add(TYP prv) {
        Uzel n = new Uzel(prv);
        if (size == 0) {
            this.first = n;
            this.last = n;
        } else {
            this.last.next = n;
            this.last = n;
        }
        size++;
    }

    public int getDelka(){return this.size;}
    public TYP getUzel(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Mimo meze index:" + i + ", size:" + this.size);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Index mensi nez 0");
        }
        Uzel prvek = first;
        for (int j = 0; j < i; j++) {
            prvek = prvek.next;
        }
        return prvek.value;
    }

    public void removeUzel(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Mimo meze index:" + i + ", size:" + this.size);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Index mensi nez 0");
        }
        if (i == 0) {
            first = first.next;
        } else {
            Uzel curr = first;
            for (int j = 0; j < i - 1; j++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            if (i == size - 1) {
                last = curr;
            }
        }
        size--;
    }
    private class Uzel {

        private TYP value;
        private Uzel next;

        private Uzel(TYP value) {
            this.value = value;
        }
    }
}
