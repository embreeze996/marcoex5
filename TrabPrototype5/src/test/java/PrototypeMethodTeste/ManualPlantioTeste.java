package PrototypeMethodTeste;

import PrototypeMethod.Condicao;
import PrototypeMethod.ManualPlantio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManualPlantioTeste {

    @Test
    void testClone() throws CloneNotSupportedException {
        ManualPlantio manualPlantio = new ManualPlantio("Primavera", "Aster Chinesa", new Condicao("Alta", 7));

        ManualPlantio manualClone = manualPlantio.clone();
        manualClone.setEstacao("Verão");
        manualClone.setEspecie("Rosa do deserto");
        manualClone.getCondicao().setPh(10);

        assertEquals("ManualPlantio{estacao=Primavera, especie='Aster Chinesa', condicao=Condicao{umidadeSolo='Alta', ph=7},}", manualPlantio.toString());
        assertEquals("ManualPlantio{estacao=Verao, especie='Rosa do deserto', condicao=Condicao{umidadeSolo='Baixa', ph=10},}", manualClone.toString());
    }
}