public interface State{
    public void pressDown();
    public void releaseDown();
    public void pressUp();
    public void releaseUp();
    public void hitByThrown();
    public void hitByRolled();
    public void hitByFire();
    public void pressEsc();
    public void endShield();
}
