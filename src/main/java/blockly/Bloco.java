package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * Bloco
 *
 * @author Wesley Miranda De Oliveira
 * @since 24/05/2022 15:01:42
 *
 */
public static Var Retornar_Substring() throws Exception {
 return new Callable<Var>() {

   private Var texto = Var.VAR_NULL;
   private Var posicaoLetra = Var.VAR_NULL;

   public Var call() throws Exception {
    texto =
    Var.valueOf("Pegando posição letra");
    posicaoLetra =
    cronapi.text.Operations.getLettersFromStartToFromStart(texto,
    Var.valueOf(3),
    Var.valueOf(7));
    System.out.println(posicaoLetra.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

