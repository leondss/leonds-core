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

package com.leonds.core.orm;

/**
 * @author Leon
 */
public enum Operator {
    AND,
    OR,
    NOT,
    LT,
    GT,
    EQ,
    NEQ,
    NONE,
    LE,
    GE,
    IS_NULL,
    IS_NOT_NULL,
    LIKE,
    CONTAINS,
    STARTS_WITH,
    ENDS_WITH,
    IN,
    NOT_IN,
    NEAR,
    WITHIN,
    ALL
}
