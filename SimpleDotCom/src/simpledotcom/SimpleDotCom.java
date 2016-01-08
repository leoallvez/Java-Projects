package simpledotcom;
/**
 *
 * @author Leonardo Pereira Alves
 * @version 27-12-2014
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0; 
    public void setLocationCells (int[] locs){
        locationCells = locs;   
    }
    public String checkYourself (String stringGuess){
        int guess = Integer.parseInt(stringGuess); // Convertendo uma string em um número inteiro.
        String result = "miss";
        for (int cell : locationCells ){ // Percorre a matriz e atribui a variavel cell.
            if (guess == cell){
                result = "hit";
                numOfHits++; // incrementação
                break; // Para o for.
            }
        } // Fora do loop
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    } // Fora do metodo.  
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4}; // definicão da matriz
        dot.setLocationCells(locations); // Passando o valor da matriz para o objeto
        String userGuess = "2"; // definindo palpite
        String result = dot.checkYourself(userGuess);
    } 
}
