import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

//
public class PessoaTeste {
    @Test
    void validarCalculoIdadeCorreto() {
        Pessoa junior = new Pessoa("Junior", LocalDate.of(2000, 06, 12));
        Assertions.assertEquals(23, junior.getIdade());
    }
    @Test
    void retornoSeEhMaiorDeIdade(){  //pode-se colocar dois ou mais inserts em um test
        Pessoa junior = new Pessoa("Junior", LocalDate.of(2000, 06, 12));
        Assertions.assertTrue(junior.ehMaiorDeIdade());

        Pessoa adolfo = new Pessoa("Adolfo", LocalDate.of(2020, 06, 12));
        Assertions.assertFalse(adolfo.ehMaiorDeIdade());
    }

}
