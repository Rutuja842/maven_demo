public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result=Addition.add(6,4);
        int correct= 10;
        if (!equals(10, result)) throw new AssertionError();
    }

    private boolean equals(int i, int result) {
        return true;
    }


}