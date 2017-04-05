package luxoft.element;


public class NumberUniqueWrapper {

    private Element element;

    public NumberUniqueWrapper( Element element ) {
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public int hashCode() {
        return 31 * this.element.getNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberUniqueWrapper that = (NumberUniqueWrapper) o;

        return getElement().getNumber() == that.getElement().getNumber();

    }
}
