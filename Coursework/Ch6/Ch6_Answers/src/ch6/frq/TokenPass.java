package ch6.frq;

public class TokenPass {
    
    private int[] board;
    private int currentPlayer;
    
    
    public TokenPass(int playerCount) {
        board = new int[playerCount];

        for (int i = 0; i < board.length; i++) {
            board[i] = (int)(10*Math.random()) + 1;
        }

        currentPlayer = (int)(playerCount*Math.random());
    }

    public void distributeCurrentPlayerTokens(){
        int numTokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int pos = (currentPlayer!=board.length-1)?currentPlayer+1:0;
        while(numTokens>0){
            board[pos]++;
            numTokens--;
            pos = (pos!=board.length-1)?pos+1:0;
        }
    }

    public String toString(){
        String output="[\t";
        for(int s:board){
            output+=s;
            output+="\t";
        }
        output+="]";
        return output;

    }

    

}
