import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class teste {
	
	   private static final String[] Simbolos_Romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    private static final int[] Valores_Arabicos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	    public String arabicoToRomano(int number) {
	        if (number <= 1 || number >= 1001) {
	            throw new IllegalArgumentException("Número inválido. Deve estar entre 1 e 1001.");
	        }
	        StringBuilder numeroRomano = new StringBuilder();
	        int i = 0;
	        while (number > 0) {
	            if (number >= Valores_Arabicos[i]) {
	                numeroRomano.append(Simbolos_Romanos[i]);
	                number -= Valores_Arabicos[i];
	            } else {
	                i++;
	            }
	        }
	        return numeroRomano.toString();
	    }

	    public int romanoParaArabico(String numeroRomano) {
	        if (numeroRomano == null || numeroRomano.isEmpty()) {
	            throw new IllegalArgumentException("Número romano inválido.");
	        }
	        int arabicNumber = 0;
	        int i = 0;
	        while (i < numeroRomano.length()) {
	            char currentSymbol = numeroRomano.charAt(i);
	            int currentValue = getArabicValue(currentSymbol);
	            if (i + 1 < numeroRomano.length()) {
	                char nextSymbol = numeroRomano.charAt(i + 1);
	                int nextValue = getArabicValue(nextSymbol);
	                if (nextValue > currentValue) {
	                    arabicNumber += nextValue - currentValue;
	                    i += 2;
	                    continue;
	                }
	            }
	            arabicNumber += currentValue;
	            i++;
	        }
	        return arabicNumber;
	    }

	    private int getArabicValue(char simboloRomano) {
	        switch (simboloRomano) {
	            case 'M':
	                return 1000;
	            case 'D':
	                return 500;
	            case 'C':
	                return 100;
	            case 'L':
	                return 50;
	            case 'X':
	                return 10;
	            case 'V':
	                return 5;
	            case 'I':
	                return 1;
	            default:
	                throw new IllegalArgumentException("Símbolo romano inválido.");
	        }
	    }

	    @Test
	    public void testarabicoToRomano() {
	        teste converter = new teste();
	        assertEquals("I", converter.arabicoToRomano(1));
	        assertEquals("IV", converter.arabicoToRomano(4));
	        assertEquals("IX", converter.arabicoToRomano(9));
	        assertEquals("XL", converter.arabicoToRomano(40));
	        assertEquals("XC", converter.arabicoToRomano(90));
	        assertEquals("CD", converter.arabicoToRomano(400));
	        assertEquals("CM", converter.arabicoToRomano(900));
	        assertEquals("M", converter.arabicoToRomano(1000));
	        assertEquals("MI", converter.arabicoToRomano(1001));
	    }

	    @Test
	    public void testromanoParaArabico() {
	        teste converter = new teste();
	        assertEquals(1, converter.romanoParaArabico("I"));
}
}
