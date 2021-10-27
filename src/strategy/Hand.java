package strategy;

public enum Hand {

    rock,

    paper,

    scissor;

    public int compare(Hand hand){
        if(this == hand) return 0;
        if(this == rock) return hand == scissor ? 1 : -1;
        if(this == paper) return hand == rock ? 1 : -1;
        if(this == scissor) return hand == paper ? 1 : -1;
        return -1;
    }

    public static Hand get(int index){
        switch (index){
            case 0: return rock;
            case 1: return paper;
            case 2: return scissor;
        }
        return null;
    }

}
