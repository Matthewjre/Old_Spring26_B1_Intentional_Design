import java.util.Objects;

public class Cat
{
    private String breed;
    private double tailLength;

    /**
     *
     *
     *
     *
     *
     *
     */
    public Cat(String aBreed, double aTailLength) {
        this.breed = aBreed;
        this.tailLength = aTailLength;
    }

    /**
     *
     *
     *
     *
     *
     *
     *
     */
    public void growTail() {
        this.tailLength += 1;
    }

    public int getTailLength() {
        return tailLength;
    }

    public String getBreed() {
        return breed;
    }

    /**
    *
    *
    *
    *
    *
    *
    */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getTailLength() == cat.getTailLength() && Objects.equals(getBreed(), cat.getBreed());
    }

    /**
     *
     *
     *
     *
     *
     *
     *
     */
    @Override
    public String toString() {
        return "Cat{breed='" + breed + "', tailLength=" + tailLength + "}";
    }
}
