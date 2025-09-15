package jogo;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;


import java.beans.Transient;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

        Jogador jogador = mock(Jogador.class);;

        Dado dado = mock(Dado.class);

        Jogo jogo = mock(Jogo.class);

        @Test
        public void teste(){
            when(dado.numero()).thenReturn(2);
            assertEquals(dado.numero(),2);

        }

        @Test
        public void test2(){
            Dado dado2 = mock(Dado.class);
            when(dado.numero()).thenReturn(2);
            when(dado2.numero()).thenReturn(3);
            when(jogador.lancar(dado, dado2)).thenReturn(5);
            assertEquals(5, jogador.lancar(dado, dado2));
        }

        @Test
        public void jogadorVence(){
            Dado dado2 = mock(Dado.class);
            when(dado.numero()).thenReturn(3);
            when(dado2.numero()).thenReturn(4);
            when(jogador.lancar(dado, dado2)).thenReturn(7);
            assertTrue(jogo.jogo());
    
        }

        @Test
        public void jogadorPerde(){
            Dado dado2 = mock(Dado.class);
            when(dado.numero()).thenReturn(1);
            when(dado2.numero()).thenReturn(1);
            when(jogador.lancar(dado, dado2)).thenReturn(2);
            when(jogo.jogo()).thenReturn(false);
            assertFalse(jogo.jogo());
    
        }
}
