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

import com.leonds.core.ServiceException;
import com.leonds.core.SpringContextHolder;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author Leon
 */
public class CheckUtils {
    private CheckUtils() {

    }

    public static <T> void checkNotNull(T input, String message) {
        if (input == null) {
            throw new ServiceException(message);
        }
    }

    public static void checkState(boolean input, String message) {
        if (!input) {
            throw new ServiceException(message);
        }
    }

    public static void checkNotBlank(String input, String message) {
        if (StringUtils.isBlank(input)) {
            throw new ServiceException(message);
        }
    }

    public static <T> void checkObject(T instance) {
        if (instance == null) {
            throw new ServiceException("Object not null.");
        }
        Validator validator = SpringContextHolder.getBean(Validator.class);
        Set<ConstraintViolation<T>> validate = validator.validate(instance);
        if (!validate.isEmpty()) {
            throw new ServiceException(validate.iterator().next().getMessage());
        }
    }
}
