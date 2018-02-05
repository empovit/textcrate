/*
 * Copyright © 2016-2018 European Support Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amdocs.messageformatting;

import static org.testng.Assert.assertNotEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

/**
 * @author evitaliy
 * @since 29 Jan 18
 */
public class BaseMessageBlueprintTest {

    @Test
    public void notEqualWhenPropertiesDifferent() {
        Map<String, String> props = new HashMap<>(1);
        props.put("A", "a");
        BaseMessageBlueprint one = new BaseMessageBlueprint(null, null, Collections.emptyMap());
        BaseMessageBlueprint two = new BaseMessageBlueprint(null, null, props);
        assertNotEquals(one, two);
    }

}