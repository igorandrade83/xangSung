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
 * @return Var
 */
// Bloco
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.map.Operations.createObjectMapWith(Var.valueOf("id",cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()))));
    return cronapi.map.Operations.getMapField(item, Var.valueOf("id"));
   }
 }.call();
}

}

