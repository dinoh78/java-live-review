package week12.encapsulation.Copmuter;

public class Windows extends Computer {
    private boolean isTouchScreen;

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    @Override
    public void use(String purpose) {
        System.out.println("Using windows laptop for coding and " + purpose);
    }
}
