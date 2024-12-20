/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.paranomum.page_object;

import lombok.Getter;
import ru.paranomum.page_object.api.TemplateDefinition;
import ru.paranomum.page_object.config.GeneratorSettings;

import java.util.List;

public class ClientOptInput {
    private CodegenConfig config;
    private GeneratorSettings generatorSettings;
    // not deprecated as this is added to match other functionality, we need to move to Context<?> instead of ClientOptInput.
    @Getter private List<TemplateDefinition> userDefinedTemplates;


    public ClientOptInput generatorSettings(GeneratorSettings generatorSettings) {
        this.setGeneratorSettings(generatorSettings);
        return this;
    }

    public ClientOptInput config(CodegenConfig codegenConfig) {
        this.setConfig(codegenConfig);
        return this;
    }

    public ClientOptInput userDefinedTemplates(List<TemplateDefinition> userDefinedTemplates) {
        this.userDefinedTemplates = userDefinedTemplates;
        return this;
    }

    @Deprecated
    public CodegenConfig getConfig() {
        return config;
    }

    /**
     * Sets the generator/config instance
     *
     * @deprecated use {@link #config(CodegenConfig)} instead
     * @param config codegen config
     */
    @Deprecated
    public void setConfig(CodegenConfig config) {
        this.config = config;
    }

    @Deprecated
    public GeneratorSettings getGeneratorSettings() {
        return generatorSettings;
    }

    @Deprecated
    private void setGeneratorSettings(GeneratorSettings generatorSettings) {
        this.generatorSettings = generatorSettings;
    }

}
