/*
 * Copyright 2019 leondss@qq.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.leonds.core.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Leon
 */
public class ObjUtils {
    private ObjUtils() {
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> map(Object input) {
        if (input == null) {
            return new HashMap<>();
        }
        if (input instanceof Map) {
            return (Map<String, Object>) input;
        }
        return new HashMap<>();
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> list(Object input) {
        if (input == null) {
            return Collections.emptyList();
        }
        if (input instanceof List) {
            return (List<T>) input;
        }
        return Collections.emptyList();
    }

    public static Boolean bool(Object input) {
        if (input == null) {
            return false;
        }
        if (input instanceof Boolean) {
            return (Boolean) input;
        }
        return false;
    }

    public static String string(Object input) {
        return input == null ? "" : input.toString();
    }

    public static int number(Object input) {
        return input == null ? 0 : Integer.valueOf(input.toString());
    }
}
