package junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.platform.suite.api.Suite;

@Suite
@SuiteDisplayName("Teste geral")
@SelectClasses({gerenciadorClienteTeste1.class, gerenciadorClienteTeste2.class,gerenciadorClienteTeste3.class,gerenciadorContaTeste3.class, gerenciadorClienteTeste4.class,gerenciadorContaTeste4.class, gerenciadorClienteTeste5.class,gerenciadorContaTeste6.class,gerenciadorClienteTeste7.class,gerenciadorClienteTeste8.class,gerenciadorClienteTeste10.class,gerenciadorContaTeste11.class})
public class testCompleto {
    
}
