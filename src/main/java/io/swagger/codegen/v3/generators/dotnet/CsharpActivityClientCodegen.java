package io.swagger.codegen.v3.generators.dotnet;

import io.swagger.codegen.v3.CodegenType;
import io.swagger.codegen.v3.SupportingFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsharpActivityClientCodegen extends CSharpClientCodegen {
    public static final String PROJECT_NAME = "projectName";

    static Logger LOGGER = LoggerFactory.getLogger(CsharpActivityClientCodegen.class);

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "csharp-activity";
    }

    public String getHelp() {
        return "Generates a csharp activity client.";
    }

    public CsharpActivityClientCodegen() {
        super();
        netCoreProjectFileFlag = true;
    }

    public void processOpts() {
        super.processOpts();
        supportingFiles.add(new SupportingFile("IActivity.mustache", "", "IActivities.json"));
    }
}
