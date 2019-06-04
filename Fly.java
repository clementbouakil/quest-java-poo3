public interface Fly {

    void takeOff();

    void ascend(int meters);

    void descend(int meters);

    void land();

    default void glide() {
        System.out.println("It glides into the air.");
    }
}