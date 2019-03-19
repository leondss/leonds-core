
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
