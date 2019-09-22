package pl.sda.javastart.day5;

public class ExperimentalObject {
    private Integer notFinalImutable;
    private final Integer finalImmutable; // nie mozna zmienic referencji bo jest final i Integer nie jest zmienialny
    private final TestPerson finalMutable; // mozna zmienic referencje bo TestPerson jest zmienialne

    public ExperimentalObject(Integer notFinalImutable, Integer finalImmutable, TestPerson finalMutable) {
        this.notFinalImutable = notFinalImutable;
        this.finalImmutable = finalImmutable;
        this.finalMutable=finalMutable;
    }

    public TestPerson getFinalMutable() {
        return finalMutable;
    }

    public Integer getNotFinalImutable() {
        return notFinalImutable;
    }

    public void setNotFinalImutable(Integer notFinalImutable) {
        this.notFinalImutable = notFinalImutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }
}
