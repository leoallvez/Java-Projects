package tapedeck;

/**
 *
 * @author Leonardo
 */
class TapeDeck {
    boolean canRecord = false;
    
    void PlayTape(){
        System.out.println("tape playing");
    }
    void RecordTape(){
        System.out.println("tape recording");
    }
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.PlayTape();
        
        if (t.canRecord == true) {
            t.RecordTape();
        }
    }
    
}
