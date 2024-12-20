/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
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

package ru.paranomum.page_object.templating.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template.Fragment;

import java.io.IOException;
import java.io.Writer;

/**
 * Saves template text to be used later.
 *
 * Register:
 * <pre>
 * additionalProperties.put("copy", new CopyLambda());
 * </pre>
 *
 * Use:
 * <pre>
 * {{#copy}}{{name}}{{/copy}}
 * </pre>
 */
public class CopyLambda implements Mustache.Lambda {
    public String savedContent;

    public CopyLambda() {
    }

    @Override
    public void execute(Fragment fragment, Writer writer) throws IOException {
        savedContent = fragment.execute().stripTrailing();
    }
}
