
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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Leon
 */
public class SqlParams {

    private Map<String, Object> params = new HashMap<>();

    public static SqlParams instance() {
        return new SqlParams();
    }

    public SqlParams append(String key, Object value) {
        params.put(key, value);
        return this;
    }

    public SqlParams page(PageRequest pageRequest) {
        params.put("page", pageRequest);
        params.put("isPage", true);
        return this;
    }

    public SqlParams count() {
        params.put("isCount", "Y");
        params.put("isPage", null);
        return this;
    }

    public SqlParams unCount() {
        params.put("isCount", null);
        params.put("isPage", "Y");
        return this;
    }

    public SqlParams orderByClause(String orderByClause) {
        params.put("orderByClause", orderByClause);
        return this;
    }

    public PageRequest getPageRequest() {
        return (PageRequest) params.get("page");
    }

    public Map<String, Object> params() {
        return params;
    }
}
