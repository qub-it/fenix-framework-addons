package pt.ist.fenixframework.backend.jvstm;

import pt.ist.fenixframework.dml.CompilerArgs;
import pt.ist.fenixframework.dml.DomainModel;

public class InMemCodeGenerator extends JVSTMCodeGenerator {
    
    public InMemCodeGenerator(CompilerArgs compArgs, DomainModel domainModel) {
        super(compArgs, domainModel);
    }
    
    
    @Override
    protected String getDomainClassRoot() {
        return InMemDomainObject.class.getName();
    }

    
}