package Json;

import java.util.HashMap;

public class JsonTradutor extends JsonEntrada {

    //método para converter hexadecimal para binário
    public String hexParaBinario(String hex) {

        //variavel para armazenar o binario
        String binary = "";

        hex = hex.toUpperCase();

        // inicializando a hashmap
        HashMap<Character, String> hashMap
                = new HashMap<Character, String>();

        // armazenando os valores
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");

        int i;
        char ch;

        // loop para iterar na string hexadecimal a partir da terceira posicao
        for (i = 2; i < hex.length(); i++) {

            ch = hex.charAt(i);

            if (hashMap.containsKey(ch))
                binary += hashMap.get(ch);
            else {
                binary = "Hexadecimal invalido";
                return binary;
            }
        }

        // retorna o binário convertido
        return binary;
    }
    //separando a string binaria
    public String getOpcode(String binary){
        String opcode = binary.substring(0, 6);
        return opcode;
    }
    public String getReg1(String binary){
        String reg1 = binary.substring(6, 11);
        return reg1;
    }
    public String getReg2(String binary){
        String reg2 = binary.substring(11, 16);
        return reg2;
    }
    public String getReg3(String binary){
        String reg3 = binary.substring(16, 21);
        return reg3;
    }
    public String getReg4(String binary){
        String reg4 = binary.substring(21, 26);
        return reg4;
    }
    public String getFunc(String binary){
        String func = binary.substring(26, 32);
        return func;
    }

}

