import java.util.Arrays;

public class Rotor {


    private String rotorValues;
    private char startChar;

    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;

        while(!this.rotate());

    }

    public boolean rotate(){
        //TODO
        char[] rotorV = this.rotorValues.toCharArray();
        char[] rotorC = new char[rotorV.length];
        char temp = rotorV[26];
        for(int i = 1; i < rotorV.length; i++){
            rotorC[i + 1] = rotorV[i];
        }
        rotorC[0] = temp;
        this.rotorValues = Arrays.toString(rotorC);

        if (temp == startChar) {
            return true;
        }
        return false;



    }


    public int indexOf(char c){
        //TODO
        char[] rotor = this.rotorValues.toCharArray();
        for(int i = 0; i < rotor.length; i++){
            if(rotor[i] == c){
                return i;
            }
        }
        return -1;


    }

    public char charAt(int idx){
        //TODO
        char[] rotor = this.rotorValues.toCharArray();
        return rotor[idx];

    }
}
