package com.springmodulith.demo.document;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

import com.springmodulith.demo.DemoApplication;

/**
 * @author : Ezekiel Eromosei
 * @code @created : 02 Jun, 2024
 */

public class DocumentationTests {
    ApplicationModules modules = ApplicationModules.of(DemoApplication.class);

    @Test
    void writeDocumentationSnippets(){
        new Documenter(modules)
                .writeModulesAsPlantUml(Documenter.DiagramOptions.defaults()
                        .withStyle(Documenter.DiagramOptions.DiagramStyle.UML))

                .writeIndividualModulesAsPlantUml(Documenter.DiagramOptions.defaults()
                .withStyle(Documenter.DiagramOptions.DiagramStyle.UML))
                .writeModuleCanvases();



        Documenter.DiagramOptions.defaults()
                .withStyle(Documenter.DiagramOptions.DiagramStyle.UML);
    }
}
